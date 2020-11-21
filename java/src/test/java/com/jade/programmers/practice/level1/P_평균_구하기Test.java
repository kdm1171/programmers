package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_평균_구하기Test {

    P_평균_구하기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_평균_구하기();
    }

    @Test
    public void testCase1() {
        int[] param = {1, 2, 3, 4};

        double expected = 2.5;

        double result = p.solution(param);

        assertEquals(expected, result, 0);
    }

    @Test
    public void testCase2() {
        int[] param = {5, 5};

        double expected = 5;

        double result = p.solution(param);

        assertEquals(expected, result, 0);
    }
}