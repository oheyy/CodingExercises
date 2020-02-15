package com.daniel.codingexercises.challenges.SortArrayByParity;

public class SortArrayByParity {
    public SortArrayByParity(){}

    public int[] sortArrayByParity(int[] A) {
        int[] sortedArray = new int[A.length];
        int last = A.length - 1;
        int first = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]%2 == 0){
                //Even
                sortedArray[first] = A[i];
                first += 1;
            }else{
                //Odd
                sortedArray[last] = A[i];
                last -= 1;
            }
        }
        return sortedArray;
    }
}
