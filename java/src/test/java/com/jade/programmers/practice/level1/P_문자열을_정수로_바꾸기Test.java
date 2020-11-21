package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_문자열을_정수로_바꾸기Test {

    P_문자열을_정수로_바꾸기 p;
    @Before
    public void setUp() throws Exception {
        p = new P_문자열을_정수로_바꾸기();
    }

    @Test
    public void testCase1(){
        String param = "1234";

        int expected = 1234;

        int result = p.solution(param);

        assertEquals(expected, result);
    }

    @Test
    public void testCas21(){
        String param = "-1234";

        int expected = -1234;

        int result = p.solution(param);

        assertEquals(expected, result);
    }

    @Test
    public void testCase3(){
        String param = "+1234";

        int expected = 1234;

        int result = p.solution(param);

        assertEquals(expected, result);
    }
}