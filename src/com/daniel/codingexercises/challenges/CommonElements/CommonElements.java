package com.daniel.codingexercises.challenges.CommonElements;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {
    public CommonElements(){}

    public List<Integer> commonElements(int[] array1, int[] array2){
        List<Integer> commonElementsList = new ArrayList<Integer>();
        int array1Count = 0;
        int array2Count = 0;
        while(array1Count < array1.length && array2Count < array2.length){
            if(array1[array1Count] == array2[array2Count]){
                commonElementsList.add(array1[array1Count]);
                array1Count += 1;
                array2Count += 1;
            }else if(array1[array1Count] > array2[array2Count]){
                array2Count += 1;
            }else{
                array1Count += 1;
            }
        }
        return commonElementsList;
    }
}
