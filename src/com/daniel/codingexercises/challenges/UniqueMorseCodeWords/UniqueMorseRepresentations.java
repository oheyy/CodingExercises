package com.daniel.codingexercises.challenges.UniqueMorseCodeWords;

import java.util.HashMap;

public class UniqueMorseRepresentations {
    public UniqueMorseRepresentations(){}

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder res = new StringBuilder();
        HashMap<String, Integer> countMorseMap = new HashMap<String, Integer>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                res.append(morse[words[i].charAt(j) - 'a']);
            }
            if(countMorseMap.get(res) == null){
                countMorseMap.put(String.valueOf(res),1);
            }
            res.setLength(0);

        }

        return countMorseMap.size();
    }
}
