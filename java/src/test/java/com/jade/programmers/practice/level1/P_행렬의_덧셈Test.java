package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_행렬의_덧셈Test {

    P_행렬의_덧셈 p;

    @Before
    public void setUp() throws Exception {
        p = new P_행렬의_덧셈();
    }

    @Test
    public void testCase1() {
        int[][] param1 = {{1, 2}, {2, 3}};
        int[][] param2 = {{3, 4}, {5, 6}};

        int[][] expected = {{4, 6}, {7, 9}};

        int[][] result = p.solution(param1, param2);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase2() {
        int[][] param1 = {{1}, {2}};

        int[][] param2 = {{3}, {4}};

        int[][] expected = {{4}, {6}};

        int[][] result = p.solution(param1, param2);

        assertArrayEquals(expected, result);
    }
}