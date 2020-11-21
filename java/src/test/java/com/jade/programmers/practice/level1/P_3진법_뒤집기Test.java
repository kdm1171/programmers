package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_3진법_뒤집기Test {

    P_3진법_뒤집기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_3진법_뒤집기();
    }

    @Test
    public void test(){
        String expected = "0021";
        String result = p.transformAndReverse(45);

        assertEquals(expected, result);
    }
    @Test
    public void testCase1(){
        int param = 45;
        int expected = 7;
        int result = p.solution(param);
        assertEquals(expected, result);
    }

    @Test
    public void testCase2(){
        int param = 125;
        int expected = 229;
        int result = p.solution(param);
        assertEquals(expected, result);
    }
}