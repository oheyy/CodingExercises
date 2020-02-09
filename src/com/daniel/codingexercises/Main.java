package com.daniel.codingexercises;

import com.daniel.codingexercises.challenges.MostFrequent;

public class Main {

    public static void main(String[] args) {
        MostFrequent mostFrequent = new MostFrequent();
        int[] givenArray = {1,3,1,3,2,1};
        mostFrequent.mostFrequentService(givenArray);
    }
}
