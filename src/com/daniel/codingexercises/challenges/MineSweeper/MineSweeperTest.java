package com.daniel.codingexercises.challenges.MineSweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MineSweeperTest {
    @Test
    public void test_array_is_3_by_4(){
        MineSweeper mineSweeper = new MineSweeper();
        int [][] bombs = {{0,0}, {0,1}};
        int[][] expectedArray = new int[3][4];
//        assertEquals(expectedArray, mineSweeper.mineSweeper(bombs, 3, 4));
        int[][] bombs1 = {{0, 2}, {2, 0}};
        mineSweeper.mineSweeper(bombs1, 3, 3);// should return:
        // [[0, 1, -1],
        //  [1, 2, 1],
        //  [-1, 1, 0]]

        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        mineSweeper.mineSweeper(bombs2, 3, 4); //should return:
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]

        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        mineSweeper.mineSweeper(bombs3, 5, 5); //should return:
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]
    }

}