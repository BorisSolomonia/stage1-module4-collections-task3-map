package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Integer n;
        String s;
        Map<String, Integer> reverse = new HashMap<>();
        Map<Integer, String> copy = new HashMap<>();
        for (Integer f : sourceMap.keySet()) {
            s = sourceMap.get(f);
            if(reverse.containsKey(s) && reverse.get(s) > f){
                reverse.put(s,f);
            }else {
                reverse.put(s,f);
            }

        }
        return reverse;
    }
}
