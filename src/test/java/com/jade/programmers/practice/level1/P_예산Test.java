package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_예산Test {

    P_예산 p;

    @Before
    public void setUp() {
        p = new P_예산();
    }

    @Test
    public void testCase1() {
        int[] param1 = {1, 3, 2, 5, 4};
        int param2 = 9;
        int expected = 3;

        int result = p.solution(param1, param2);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        int[] param1 = {2, 2, 3, 3};
        int param2 = 10;
        int expected = 4;

        int result = p.solution(param1, param2);

        assertEquals(expected, result);
    }


}