package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_K번째수Test {

    P_K번째수 p;

    @Before
    public void setUp() throws Exception {
        p = new P_K번째수();
    }

    @Test
    public void testCase1() {
        int[] param1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] param2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] expected = {5, 6, 3};
        int[] result = p.solution(param1, param2);
        assertArrayEquals(expected, result);
    }
}