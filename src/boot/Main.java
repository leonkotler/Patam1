package boot;

import server_side.solver.BfsSearcher;
import server_side.solver.MazeProblem;
import server_side.solver.SearcherSolver;
import server_side.solver.Solver;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Server server = new MySerialServer();
//        server.open(5555, new MyTestClientHandler(new StringReverser(), new MemoryCacheManager(new HashMap<>())));

        Solver<MazeProblem, List<String>> bfsSearcherSolver = new SearcherSolver(new BfsSearcher());

        int maze[][] = {
                {5, 5, 5, 5},
                {5, 1, 1, 1},
                {5, 5, 5, 1},
                {5, 5, 5, 0}
        };

        MazeProblem mazeProblem = new MazeProblem();
        mazeProblem.setStartRow(1);
        mazeProblem.setStartCol(1);
        mazeProblem.setFinishRow(3);
        mazeProblem.setFinishCol(3);
        mazeProblem.setMaze(maze);


        List<String> solution = bfsSearcherSolver.solve(mazeProblem);

        System.out.println(solution);
    }
}
