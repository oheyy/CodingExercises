package com.daniel.codingexercises.challenges.Rotation;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotationTest {

    @Test
    public void test_rotation(){
        Rotation rotation = new Rotation();
        int[] array1 = {1,2,3,4,5,6,7};
        int[] array2 = {4,5,6,7,1,2,3};
        boolean result = rotation.isRotation(array1, array2);
        assertEquals(true, result);

        // NOTE: The following input values will be used for testing your solution.
        int[] array1a = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
        assertEquals(false, rotation.isRotation(array1a, array2a));
        // isRotation(array1, array2a) should return false.
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        assertEquals(true, rotation.isRotation(array1a, array2b));
        // isRotation(array1, array2b) should return true.
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        assertEquals(false, rotation.isRotation(array1a, array2c));
        // isRotation(array1, array2c) should return false.
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        assertEquals(false, rotation.isRotation(array1a, array2d));
        // isRotation(array1, array2d) should return false.
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        assertEquals(false, rotation.isRotation(array1a, array2e));
        // isRotation(array1, array2e) should return false.
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(true, rotation.isRotation(array1, array2f));
        // isRotation(array1, array2f) should return true.
        int[] array2g = {7, 1, 2, 3, 4, 5, 6};
        assertEquals(true,rotation.isRotation(array2g, array2b));
    }

}
