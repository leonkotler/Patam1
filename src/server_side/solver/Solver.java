package server_side.solver;

public interface Solver<Problem, Solution> {
    Solution solve(Problem problem);
}
