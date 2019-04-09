package boot;

import server_side.*;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Server server = new MySerialServer();
        server.open(5555, new MyTestClientHandler(new StringReverser(), new MemoryCacheManager(new HashMap<>())));
    }
}
