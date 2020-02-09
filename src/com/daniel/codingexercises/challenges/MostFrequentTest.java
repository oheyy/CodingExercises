package com.daniel.codingexercises.challenges;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MostFrequentTest {
    private MostFrequent mostFrequent = new MostFrequent();

    @Test
    public void testMostFrequent(){
        int[] givenArray = {1,3,1,3,2,1};
        int value = mostFrequent.mostFrequentService(givenArray);
        assertEquals(1, value);
        int[] array2 = {3, 3, 1, 3, 2, 1};
        value = mostFrequent.mostFrequentService(array2);
        assertEquals(3, value);
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        Integer nullResult = mostFrequent.mostFrequentService(array3);
        assertEquals(null, nullResult);
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        value = mostFrequent.mostFrequentService(array4);
        assertEquals(0, value);
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        value = mostFrequent.mostFrequentService(array5);
        assertEquals(-1, value);
    }

}
