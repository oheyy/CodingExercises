package com.daniel.codingexercises.challenges.ReplaceElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceElementsTest {

    @Test
    void replaceElements() {
        ReplaceElements replaceElements = new ReplaceElements();
        int[] arr = {17,18,5,4,6,1};
        int[] resultArray = {18,6,6,6,1,-1};
        int[] result = replaceElements.replaceElements(arr);
        assertEquals(resultArray.length, result.length);
        for(int i=0; i<result.length; i++){
            assertEquals(resultArray[i], result[i]);
        }
    }
}