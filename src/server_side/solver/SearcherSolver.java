package server_side.solver;

import java.util.List;

public class SearcherSolver implements Solver<MazeProblem, List<String>> {

    private Searcher searcher;


    public SearcherSolver(Searcher searcher) {
        this.searcher = searcher;
    }

    @Override
    public List<String> solve(MazeProblem mazeProblem) {
        return searcher.findShortestPath(mazeProblem);
    }
}
