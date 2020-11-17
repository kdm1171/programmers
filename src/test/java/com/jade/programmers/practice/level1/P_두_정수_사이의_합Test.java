package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_두_정수_사이의_합Test {

    P_두_정수_사이의_합 p;

    @Before
    public void setUp() throws Exception {
        p = new P_두_정수_사이의_합();
    }

    @Test
    public void testCase1(){
        int a = 3;
        int b = 5;

        long expected = 12;

        long result = p.solution(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2(){
        int a = 3;
        int b = 3;

        long expected = 3;

        long result = p.solution(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testCase3(){
        int a = 5;
        int b = 3;

        long expected = 12;

        long result = p.solution(a, b);

        assertEquals(expected, result);
    }
}