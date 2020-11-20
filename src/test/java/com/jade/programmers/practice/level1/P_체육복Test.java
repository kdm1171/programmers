package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_체육복Test {

    P_체육복 p;

    @Before
    public void setUp() throws Exception {
        p = new P_체육복();
    }

    @Test
    public void testCase1() {
        int param1 = 5;
        int[] param2 = {2, 4};
        int[] param3 = {1, 3, 5};
        int expected = 5;

        int result = p.solution(param1, param2, param3);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        int param1 = 5;
        int[] param2 = {2, 4};
        int[] param3 = {3};
        int expected = 4;

        int result = p.solution(param1, param2, param3);

        assertEquals(expected, result);
    }
    @Test
    public void testCase3() {
        int param1 = 3;
        int[] param2 = {3};
        int[] param3 = {1};
        int expected = 2;

        int result = p.solution(param1, param2, param3);

        assertEquals(expected, result);
    }

}