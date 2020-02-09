package com.daniel.codingexercises.challenges;

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    public MostFrequent(){ }

    public Integer mostFrequentService(int[] givenArray){
        int mostFrequentNumber = 0;
        int tmpMaxValue = 0;
        if(givenArray.length == 0){
            return null;
        }
        HashMap<Integer, Integer> countValueMaps = new HashMap<Integer, Integer>();
        for(int valueIdx=0; valueIdx<givenArray.length; valueIdx++){
            if(null == countValueMaps.get(givenArray[valueIdx])){
                countValueMaps.put(givenArray[valueIdx], 1);
            }else {
                countValueMaps.put(givenArray[valueIdx], countValueMaps.get(givenArray[valueIdx]) + 1);
            }
        }
        for(Map.Entry<Integer,Integer> valueFrequencyMap : countValueMaps.entrySet()){
            if(valueFrequencyMap.getValue()> tmpMaxValue){
                tmpMaxValue = valueFrequencyMap.getValue();
                mostFrequentNumber = valueFrequencyMap.getKey();
            }
        }
        return mostFrequentNumber;
    }
}
