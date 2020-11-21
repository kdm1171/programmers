package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_문자열_다루기_기본Test {

    P_문자열_다루기_기본 p;
    @Before
    public void setUp() throws Exception {
        p = new P_문자열_다루기_기본();
    }

    @Test
    public void testCase1(){
        boolean expected = false;

        String param = "a234";

        boolean result = p.solution(param);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2(){
        boolean expected = true;

        String param = "1234";

        boolean result = p.solution(param);

        assertEquals(expected, result);
    }
}