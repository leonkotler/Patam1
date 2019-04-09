package server_side;

import java.io.InputStream;
import java.io.OutputStream;

public class MyTestClientHandler implements ClientHandler {

    private Solver solver;
    private CacheManager cacheManager;

    public MyTestClientHandler(Solver solver, CacheManager cacheManager) {
        this.solver = solver;
        this.cacheManager = cacheManager;
    }

    @Override
    public void handleClient(InputStream inputStream, OutputStream outputStream) {

    }
}
