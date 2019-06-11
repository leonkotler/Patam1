package server_side.solver;

import java.util.List;

public interface Searcher {

    List<String> findShortestPath(MazeProblem mazeProblem);
}
