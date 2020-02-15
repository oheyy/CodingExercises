package com.daniel.codingexercises.challenges.NRepeatedElementInArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedElementInArrayTest {

    @Test
    void repeatedNTimes() {
        RepeatedElementInArray repeatedElementInArray = new RepeatedElementInArray();
        int[] array = {1,2,3,3};
        assertEquals(3,repeatedElementInArray.repeatedNTimes(array));
        int[] array1 = {2,1,2,5,3,2};
        assertEquals(2,repeatedElementInArray.repeatedNTimes(array1));
        int[] array2 = {5,1,5,2,5,3,5,4};
        assertEquals(2,repeatedElementInArray.repeatedNTimes(array2));
    }
}