package com.daniel.codingexercises.challenges.CommonElements;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonElementsTest {
    private CommonElements commonElements = new CommonElements();

    @Test
    public void CommonElementsTest(){
        int[] array1 = {1,3,4,6,7,9};
        int[] array2 = {1,2,4,5,9,10};
        List<Integer> result = commonElements.commonElements(array1, array2);
        assertEquals(3, result.size());

        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        assertEquals(5, commonElements.commonElements(array1B, array2B).size());
        // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        // common_elements(array1C, array2C) should return [] (an empty array).
        assertEquals(0, commonElements.commonElements(array1C, array2C).size());

    }

}
