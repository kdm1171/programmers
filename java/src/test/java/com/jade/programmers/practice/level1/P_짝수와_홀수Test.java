package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_짝수와_홀수Test {

    P_짝수와_홀수 p;

    @Before
    public void setUp() throws Exception {
        p = new P_짝수와_홀수();
    }

    @Test
    public void testCase1(){
        int param = 3;

        String expected = "Odd";

        String result = p.solution(param);

        assertEquals(expected, result);
    }
    @Test
    public void testCase4(){
        int param = 4;

        String expected = "Even";

        String result = p.solution(param);

        assertEquals(expected, result);
    }

}