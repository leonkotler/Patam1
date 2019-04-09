package server_side;

public interface Server {
    void open(int port, ClientHandler clientHandler);
}
