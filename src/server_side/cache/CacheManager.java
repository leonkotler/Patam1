package server_side.cache;

public interface CacheManager<Problem, Solution> {

    Solution getSolution(Problem problem);
    void saveSolution(Problem problem, Solution solution);

}
