package com.daniel.codingexercises.challenges.FindAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] input) {
        List<Integer> disappearedNumbersList = new ArrayList<Integer>();

        for(int i=1; i<input.length+1; i++){
            disappearedNumbersList.add(i);
        }
        for(final int number: input){
            if(number > 0 && number < input.length +1){
                disappearedNumbersList.removeIf(value -> value.equals(number));
            }
        }
        return disappearedNumbersList;
    }
}
