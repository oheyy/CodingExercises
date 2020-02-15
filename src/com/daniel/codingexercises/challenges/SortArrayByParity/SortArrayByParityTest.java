package com.daniel.codingexercises.challenges.SortArrayByParity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityTest {

    @Test
    void sortArrayByParity() {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] A = {3,1,2,4};
        int[] result = sortArrayByParity.sortArrayByParity(A);
        assertEquals(4, result.length);
        int[] expectedArray = {2,4,1,3};
        for(int i=0; i<expectedArray.length; i++){
            assertEquals(expectedArray[i], result[i]);
        }
    }
}