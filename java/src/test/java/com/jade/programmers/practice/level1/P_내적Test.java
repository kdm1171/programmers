package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_내적Test {

    P_내적 p;

    @Before
    public void setUp() throws Exception {
        p = new P_내적();
    }

    @Test
    public void testCase1() {
        int[] param1 = {1, 2, 3, 4};
        int[] param2 = {-3, -1, 0, 2};
        int expected = 3;
        int result = p.solution(param1, param2);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        int[] param1 = {-1, 0, 1};
        int[] param2 = {1, 0, -1};
        int expected = -2;
        int result = p.solution(param1, param2);

        assertEquals(expected, result);
    }
}