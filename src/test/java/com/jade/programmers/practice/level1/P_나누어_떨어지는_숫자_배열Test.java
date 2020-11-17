package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_나누어_떨어지는_숫자_배열Test {


    P_나누어_떨어지는_숫자_배열 p;

    @Before
    public void setUp() throws Exception {
        p = new P_나누어_떨어지는_숫자_배열();
    }

    @Test
    public void testCase1() {
        int[] expected = new int[]{5, 10};

        int[] result = p.solution(new int[]{5, 9, 7, 10}, 5);

        assertArrayEquals(expected, result);
    }


    @Test
    public void testCase2() {
        int[] expected = new int[]{1, 2, 3, 36};

        int[] result = p.solution(new int[]{2, 36, 1, 3}, 1);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase3() {
        int[] expected = new int[]{-1};

        int[] result = p.solution(new int[]{3, 2, 6}, 10);

        assertArrayEquals(expected, result);
    }
}