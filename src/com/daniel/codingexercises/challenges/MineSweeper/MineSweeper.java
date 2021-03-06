package com.daniel.codingexercises.challenges.MineSweeper;

public class MineSweeper {
    public MineSweeper(){}

    public int[][] mineSweeper(int[][] bombs, int rows, int cols){
        int[][] mineSweeper = new int[rows][cols];
        for(int i=0; i<bombs.length; i++){
            int bombX = bombs[i][0];
            int bombY = bombs[i][1];
            mineSweeper[bombX][bombY] = -1;
            for(int row = bombX - 1; row<rows && row < bombX+2; row++){
                if(row >= 0){
                    for(int col = bombY -1; col<cols && col<bombY+2; col++ ){
                        if((col >= 0 && mineSweeper[row][col] != -1)){
                            mineSweeper[row][col] = mineSweeper[row][col] += 1;
                        }

                    }
                }
            }
        }
        return mineSweeper;
    }

    public int[][] click(int[][] field, int numRows, int numCols, int i, int j){
        if(field[i][j] == 0){
            for(int row=0; row<numRows; row++){
                for(int col=0; col<numCols; col++){
                    if(field[row][col] == 0){
                        field[row][col] = -2;
                    }
                }
            }
        }
        return field;
    }
}
