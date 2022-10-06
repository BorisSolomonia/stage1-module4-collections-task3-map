package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] splitSentence = sentence.split("[ .,]");
        Map<String,Integer> wordCount = new HashMap<>();
        for (String k: splitSentence) {
            System.out.println(k + " ... "+ wordCount.containsKey(k));

            if (wordCount.containsKey(k.toLowerCase(Locale.ROOT)) && k.length() > 0){

                int n = wordCount.get(k.toLowerCase(Locale.ROOT))+1;
                System.out.println(n);
                wordCount.put(k.toLowerCase(Locale.ROOT), n);
            }else if(k.length() > 0){
                wordCount.put(k.toLowerCase(Locale.ROOT), 1);
            }
        }
        return wordCount;
    }
}
