package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_모의고사Test {

    P_모의고사 p;

    @Before
    public void setUp() throws Exception {
        p = new P_모의고사();
    }

    @Test
    public void testCase1() {
        int[] param = {1, 2, 3, 4, 5};

        int[] expected = {1};

        int[] result = p.solution(param);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase2() {
        int[] param = {1, 3, 2, 4, 2};

        int[] expected = {1, 2, 3};

        int[] result = p.solution(param);

        assertArrayEquals(expected, result);
    }
}