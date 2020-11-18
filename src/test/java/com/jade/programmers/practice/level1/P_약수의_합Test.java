package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_약수의_합Test {

    P_약수의_합 p;

    @Before
    public void setUp() throws Exception {
        p = new P_약수의_합();
    }

    @Test
    public void testCase1(){
        int param = 12;
        int expected = 28;

        int result = p.solution(param);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2(){
        int param = 5;
        int expected = 6;

        int result = p.solution(param);

        assertEquals(expected, result);
    }
}