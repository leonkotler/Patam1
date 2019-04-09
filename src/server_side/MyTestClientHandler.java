package server_side;

import java.io.*;

public class MyTestClientHandler implements ClientHandler {

    private Solver<String, String> solver;
    private CacheManager<String, String> cacheManager;

    public MyTestClientHandler(Solver<String, String> solver, CacheManager<String, String> cacheManager) {
        this.solver = solver;
        this.cacheManager = cacheManager;
    }

    @Override
    public void handleClient(InputStream inputStream, OutputStream outputStream) {

        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
        PrintWriter out = new PrintWriter(outputStream);

        String line;

        try {
            while ((line = in.readLine()) != null  && !line.equals("end")) {

                String solutionFromCache = cacheManager.getSolution(line);

                if (solutionFromCache == null) {
                    System.out.println("-> Solution not found in cache, running solver...");

                    String reversedString = solver.solve(line);
                    cacheManager.saveSolution(line, reversedString);
                    out.println(reversedString);
                    out.flush();

                } else {
                    System.out.println("-> Solution found in cache!");

                    out.println(solutionFromCache);
                    out.flush();
                }

            }

            System.out.println("-> Client terminated communication");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
