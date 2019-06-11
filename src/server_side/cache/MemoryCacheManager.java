package server_side.cache;

import java.util.Map;

public class MemoryCacheManager implements CacheManager<String, String> {

    private Map<String, String> cache;

    public MemoryCacheManager(Map<String, String> cache) {
        this.cache = cache;
    }

    @Override
    public String getSolution(String stringToReverse) {
        return cache.get(stringToReverse);
    }

    @Override
    public void saveSolution(String stringToReverse, String reversedString){
        cache.put(stringToReverse, reversedString);
    }
}
