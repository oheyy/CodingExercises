package com.daniel.codingexercises.challenges.OneAway;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAwayTest {

    @Test
    void isOneAway() {
        OneAway oneAway = new OneAway();
        assertEquals(true,oneAway.isOneAway("abcde", "abfde"));
        assertEquals(true, oneAway.isOneAway("xyz", "xyaz"));

//        isOneAway("abcde", "abcd");  // should return true
        assertEquals(true, oneAway.isOneAway("abcde", "abcd"));
//        isOneAway("abde", "abcde");  // should return true
        assertEquals(true, oneAway.isOneAway("abde", "abcde"));
//        isOneAway("a", "a");  // should return true
        assertEquals(true, oneAway.isOneAway("a", "a"));
//        isOneAway("abcdef", "abqdef");  // should return true
        assertEquals(true, oneAway.isOneAway("abcdef", "abqdef"));
//        isOneAway("abcdef", "abccef");  // should return true
        assertEquals(true, oneAway.isOneAway("abcdef", "abccef"));
//        isOneAway("abcdef", "abcde");  // should return true
        assertEquals(true, oneAway.isOneAway("abcdef", "abcde"));
//        isOneAway("aaa", "abc");  // should return false
        assertEquals(false, oneAway.isOneAway("aaa", "abc"));
//        isOneAway("abcde", "abc");  // should return false
        assertEquals(false, oneAway.isOneAway("abcde", "abc"));
//        isOneAway("abc", "abcde");  // should return false
        assertEquals(false, oneAway.isOneAway("abc", "abcde"));
//        isOneAway("abc", "bcc");  // should return false
        assertEquals(false, oneAway.isOneAway("abc", "bcc"));
    }
}