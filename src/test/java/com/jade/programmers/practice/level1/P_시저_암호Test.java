package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_시저_암호Test {

    P_시저_암호 p;

    @Before
    public void setUp() throws Exception {
        p = new P_시저_암호();
    }

    @Test
    public void testCase1(){
        String param1 = "AB";
        int param2 = 1;
        String expected = "BC";

        String result = p.solution(param1, param2);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2(){
        String param1 = "z";
        int param2 = 1;
        String expected = "a";

        String result = p.solution(param1, param2);

        assertEquals(expected, result);
    }

    @Test
    public void testCase3(){
        String param1 = "a B z";
        int param2 = 4;
        String expected = "e F d";

        String result = p.solution(param1, param2);

        assertEquals(expected, result);
    }
}