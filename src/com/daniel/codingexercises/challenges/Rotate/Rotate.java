package com.daniel.codingexercises.challenges.Rotate;

public class Rotate {
    public Rotate(){}

    public int[][] rotate(int[][]givenArray, int n){
        int[][] rotatedArray = new int[n][n];
        int colIdx = n;
        for(int i=0; i<n; i++){
            colIdx -= 1;
            for(int j=0; j<n; j++){
                rotatedArray[j][colIdx] = givenArray[i][j];
            }
        }
        return rotatedArray;
    }
}
