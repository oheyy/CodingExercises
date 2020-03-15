package com.daniel.codingexercises.challenges.MajorityElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {
    private MajorityElement majorityElement = new MajorityElement();
    @Test
    public void testMajorityElement(){
        int[] input = {3,2,3};
        int result = majorityElement.majorityElement(input);
        assertEquals(3, result);
    }

    @Test
    public void testMajorityElementSecondTest(){
        int[] input = {2,2,1,1,1,2,2};
        int result = majorityElement.majorityElement(input);
        assertEquals(2, result);
    }
}
