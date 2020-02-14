package com.daniel.codingexercises.LeetCodeChallenges.DecryptStringNumbersToLetters;

import java.util.HashMap;

public class DecryptString {
    public DecryptString(){}
    private HashMap<String, String> integerToAlphabetMap = new HashMap<String, String>() {
        {
            put("1","a");
            put("2","b");
            put("3","c");
            put("4","d");
            put("5","e");
            put("6","f");
            put("7","g");
            put("8","h");
            put("9","i");
            put("10#","j");
            put("11#","k");
            put("12#","l");
            put("13#","m");
            put("14#","n");
            put("15#","o");
            put("16#","p");
            put("17#","q");
            put("18#","r");
            put("19#","s");
            put("20#","t");
            put("21#","u");
            put("22#","v");
            put("23#","w");
            put("24#","x");
            put("25#","y");
            put("26#","z");
        }
    };
    public String freqAlphabets(String s) {
        String[] splitS = s.split("");
        String resultString = "";
        for(int i=0; i<splitS.length; i++){
            if(i+2 < splitS.length && splitS[i+2].equals("#")){
                resultString += integerToAlphabetMap.get(s.substring(i, i+3));
                i += 2;
            }else{
                resultString += integerToAlphabetMap.get(splitS[i]);
            }
        }
        return resultString;
    }
}
