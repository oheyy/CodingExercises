package com.daniel.codingexercises.challenges.UniqueMorseCodeWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueMorseRepresentationsTest {

    @Test
    void uniqueMorseRepresentations() {
        UniqueMorseRepresentations uniqueMorseRepresentations = new UniqueMorseRepresentations();
        String[] words = {"gin", "zen", "gig", "msg"};
        assertEquals(2,uniqueMorseRepresentations.uniqueMorseRepresentations(words));
    }
}