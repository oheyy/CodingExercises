package com.daniel.codingexercises.challenges.Rotate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateTest {

    @Test
    void rotate() {
        Rotate rotate = new Rotate();
        int a1[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        // rotate(a1, 3) should return:
        int [][]a1ExpectedResult = {{7,4,1},{8,5,2},{9,6,3}};
        // [[7, 4, 1],
        //  [8, 5, 2],
        //  [9, 6, 3]]
        int [][] rotatedArrayResult = rotate.rotate(a1,3);
        assertEquals(a1ExpectedResult.length, rotatedArrayResult.length);
        checkArray(a1ExpectedResult, rotatedArrayResult);
        int a2[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int[][] a2ExpectedResult = {{13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}};
        int[][] rotatedArray = rotate.rotate(a2, 4); //should return:
        assertEquals(a2ExpectedResult.length, rotatedArray.length);
        checkArray(a2ExpectedResult, rotatedArray);
    }

    private void checkArray(int[][] expected, int[][] result){
        for(int i=0; i<expected.length; i++){
            for(int j=0; j<expected.length; j++){
                assertEquals(expected[i][j], result[i][j]);
            }
        }
    }
}