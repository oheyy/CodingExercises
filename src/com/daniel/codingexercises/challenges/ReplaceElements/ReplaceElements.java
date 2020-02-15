package com.daniel.codingexercises.challenges.ReplaceElements;

public class ReplaceElements {
    public ReplaceElements(){ }

    public int[] replaceElements(int[] arr){
        int[] replacedElements = new int[arr.length];
        replacedElements[arr.length-1] = -1;
        int maxValue = arr[arr.length-1];
        for(int i=arr.length-1; i>0; --i){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
            replacedElements[i-1] = maxValue;
        }
        return replacedElements;
    }
}
