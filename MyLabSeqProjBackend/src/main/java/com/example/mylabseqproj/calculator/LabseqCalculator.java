package com.example.mylabseqproj.calculator;


import org.springframework.stereotype.Service;
import com.example.mylabseqproj.cache.LabseqCache;

@Service
public class  LabseqCalculator {
    private final LabseqCache cache;
    private Integer var = 0;

    public LabseqCalculator(LabseqCache cache) {
        this.cache = cache;
    }


    public int calculate(Integer n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        else if (n == 0 || n == 2 ) {
            cache.put(n, 0);
            return 0;
        }
        else if  (n == 1 || n == 3) {
            cache.put(n, 1);
            return 1;
        }
        var = Math.toIntExact(calculate(n - 3) + calculate(n - 4));
        cache.put(n, var);
        return var;
    }
}
