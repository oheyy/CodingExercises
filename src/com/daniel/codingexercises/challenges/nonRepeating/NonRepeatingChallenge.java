package com.daniel.codingexercises.challenges.nonRepeating;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChallenge {
    public NonRepeatingChallenge(){}

    public String nonRepeating(String str){
        LinkedHashMap<Character, Integer> nonRepeatingHash = new LinkedHashMap<Character, Integer>();
        for(int i=0; i<str.length(); i++){
            if(nonRepeatingHash.get(str.charAt(i)) != null){
                nonRepeatingHash.put(str.charAt(i), nonRepeatingHash.get(str.charAt(i)) + 1);
            }else{
                nonRepeatingHash.put(str.charAt(i),1);
            }
        }
        String nonRepeatingCharacter = null;
        for(Map.Entry<Character, Integer> letter : nonRepeatingHash.entrySet()){
            if(letter.getValue() == 1){
                nonRepeatingCharacter = String.valueOf(letter.getKey());
                break;
            }
        }
        return nonRepeatingCharacter;
    }
}
