package com.daniel.codingexercises.challenges.MoveZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    void moveZeroes() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] input = {0,1,0,3,12};
        moveZeroes.moveZeroes(input);
    }
}