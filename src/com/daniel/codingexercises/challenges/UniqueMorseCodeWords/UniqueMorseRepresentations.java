package com.daniel.codingexercises.challenges.UniqueMorseCodeWords;

import java.util.HashMap;

public class UniqueMorseRepresentations {
    public UniqueMorseRepresentations(){}

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] converted = new String[words.length];
        String res = "";
        HashMap<String, Integer> countMorseMap = new HashMap<String, Integer>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                res += morse[words[i].charAt(j) - 'a'];
            }
            if(countMorseMap.get(res) == null){
                countMorseMap.put(res,1);
            }
            converted[i]=res;
            res = "";

        }

        return countMorseMap.size();
    }
}
