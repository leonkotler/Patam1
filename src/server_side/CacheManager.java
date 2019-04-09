package server_side;

public interface CacheManager<Problem, Solution> {

    Solution getSolution(Problem problem);
    void saveSolution(Problem problem, Solution solution);

}
