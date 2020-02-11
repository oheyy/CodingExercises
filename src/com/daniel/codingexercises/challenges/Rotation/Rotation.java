package com.daniel.codingexercises.challenges.Rotation;

public class Rotation {
    public Rotation(){ }

    public boolean isRotation(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        int keyLocationArray1 = 0;
        int keyLocationArray2 = 0;
        int ifValueIs1 = 0;
        for(int i=0; i<array1.length; i++){
            if(array1[i] == 1){
                keyLocationArray1 = i;
                ifValueIs1 += 1;
            }
            if(array2[i] == 1){
                keyLocationArray2 = i;
                ifValueIs1 += 1;
            }
        }
        if(ifValueIs1 != 2){
            return false;
        }
        int k = keyLocationArray2;
        for(int j=keyLocationArray1; j<array1.length; j++){
            if(array1[j%array1.length] != array2[k%array2.length]){
                return false;
            }
            k++;
        }
        return true;
    }
}
