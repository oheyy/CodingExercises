package com.daniel.codingexercises.challenges.NRepeatedElementInArray;

import java.util.HashMap;

public class RepeatedElementInArray {
    public RepeatedElementInArray(){}

    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> lettersCountMap = new HashMap<Integer, Integer>();
        int repeatedNumber = 0;
        for(int number: A){
            if(lettersCountMap.get(number) == null){
                //New Number
                lettersCountMap.put(number, 1);
            }else{
                lettersCountMap.put(number, lettersCountMap.get(number) + 1);
                repeatedNumber = number;
            }
        }
        return repeatedNumber;
    }
}
