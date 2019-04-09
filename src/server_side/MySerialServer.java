package server_side;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class MySerialServer implements Server {

    private ClientHandler clientHandler;
    private int port;
    private boolean stop;

    @Override
    public void open(int port, ClientHandler clientHandler) {
        this.clientHandler = clientHandler;
        this.port = port;
        this.stop = false;

        new Thread(() -> {
            try {
                runServer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    private void runServer() throws Exception {
        ServerSocket server = new ServerSocket(port);
        server.setSoTimeout(5000);
        while (!stop) {
            try {
                Socket aClient = server.accept(); // blocking call
                try {

                    clientHandler.handleClient(aClient.getInputStream(), aClient.getOutputStream());
                    aClient.getInputStream().close();
                    aClient.getOutputStream().close();
                    aClient.close();

                } catch (IOException e) {
                    System.out.println("-> Received an IOException: " + e.getMessage());
                }
            } catch (SocketTimeoutException e) {
                System.out.println("-> No client connected within the set timeout, trying again...");
            }
        }
        System.out.println("-> Closing server");
        server.close();
    }

    @Override
    public void stop() {
        stop = true;
    }
}
