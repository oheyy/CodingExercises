package com.daniel.codingexercises.challenges.mostFrequent;

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    public MostFrequent(){ }

    /**
     * Determines the most frequent element in an array
     * @param givenArray
     * @return Integer value that is the most frequent element
     */
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
