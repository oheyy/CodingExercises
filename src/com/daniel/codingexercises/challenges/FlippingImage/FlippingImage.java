package com.daniel.codingexercises.challenges.FlippingImage;

public class FlippingImage {
    public FlippingImage(){ }

    public int[][] flipAndInvertImage(int[][] A) {
        int[][] flipAndInverted = new int [A.length][A.length];
        for(int i=0; i<A.length; i++){
            int start = 0;
            int end = A.length-1;
            while(start<A.length && end >= 0){
                if(A[i][start] == 1){
                    flipAndInverted[i][end] = 0;
                }else {
                    flipAndInverted[i][end] = 1;
                }
                end -=1;
                start += 1;
            }
        }
        return flipAndInverted;
    }
}
