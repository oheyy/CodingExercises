package com.daniel.codingexercies.challenges.SingleNumber;

import com.daniel.codingexercises.challenges.SingleNumber.SingleNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {
    @Test
    public void test_221_return_1(){
        SingleNumber singleNumber = new SingleNumber();
        int[] numArray = {2,2,1};
        assertEquals(1,singleNumber.singleNumber(numArray));
    }
    @Test
    public void test_41212_return_1(){
        SingleNumber singleNumber = new SingleNumber();
        int[] numArray = {4,1,2,1,2};
        assertEquals(4, singleNumber.singleNumber(numArray));
    }
}
