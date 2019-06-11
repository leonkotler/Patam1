package server_side.server;

import server_side.clienthandler.ClientHandler;

public interface Server {
    void open(int port, ClientHandler clientHandler);
    void stop();
}
