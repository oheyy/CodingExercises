package com.daniel.codingexercises.challenges.nonRepeating;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonRepeatingChallengeTest {
    @Test
    public void test_non_repeating(){
        NonRepeatingChallenge nonRepeatingChallenge = new NonRepeatingChallenge();

        assertEquals("c",nonRepeatingChallenge.nonRepeating("aabcb"));
        assertEquals("y",nonRepeatingChallenge.nonRepeating("xxyz"));
        assertEquals(null, nonRepeatingChallenge.nonRepeating("aabb"));
        assertEquals("c",nonRepeatingChallenge.nonRepeating("aabbbc")); // should return 'c'
        assertEquals("d",nonRepeatingChallenge.nonRepeating("aabbdbc")); // should return 'd'
    }

}