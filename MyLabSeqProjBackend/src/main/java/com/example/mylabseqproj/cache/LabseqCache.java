package com.example.mylabseqproj.cache;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class LabseqCache {

    //create a cache by using a hash map
    private static final HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

    //check if the cache contains the key

    public static boolean containsKey(Integer key) {
        return cache.containsKey(key);
    }

    //get the value from the cache

    public static Integer get(Integer key) {
        return cache.get(key);
    }

    //put the value in the cache

    public static void put(Integer key, Integer value) {
        cache.put(key, value);
    }

    //clear the cache

    public static void clear() {
        cache.clear();
    }


}
