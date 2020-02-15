package com.daniel.codingexercises.challenges.SortArrayByParity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityTest {

    @Test
    void sortArrayByParity() {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] A = {3,1,2,4};
        sortArrayByParity.sortArrayByParity(A);
    }
}