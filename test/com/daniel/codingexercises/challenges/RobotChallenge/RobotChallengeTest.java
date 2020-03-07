package com.daniel.codingexercises.challenges.RobotChallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotChallengeTest {
    private RobotChallenge robotChallenge = new RobotChallenge();
    @Test
    public void testUDReturnTrue(){
        boolean result = robotChallenge.judgeCircle("UD");
        assertEquals(true, result);
    }

    @Test
    public void testLLReturnTrue(){
        boolean result = robotChallenge.judgeCircle("LL");
        assertEquals(false, result);
    }
}
