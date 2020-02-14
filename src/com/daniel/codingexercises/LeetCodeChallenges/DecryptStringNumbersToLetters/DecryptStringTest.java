package com.daniel.codingexercises.LeetCodeChallenges.DecryptStringNumbersToLetters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptStringTest {

    @Test
    void freqAlphabets() {
        DecryptString decryptString = new DecryptString();
        assertEquals("jkab", decryptString.freqAlphabets("10#11#12"));
        assertEquals("acz", decryptString.freqAlphabets("1326#"));
        assertEquals("y", decryptString.freqAlphabets("25#"));
        assertEquals("abcdefghijklmnopqrstuvwxyz", decryptString.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }
}