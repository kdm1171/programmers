package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_X_만큼_간격이_있는_n개의_숫자Test {

    P_X_만큼_간격이_있는_n개의_숫자 p;

    @Before
    public void setUp() throws Exception {
        p = new P_X_만큼_간격이_있는_n개의_숫자();
    }

    @Test
    public void testCase1() {
        int param1 = 2;
        int param2 = 5;
        long[] expected = new long[]{2, 4, 6, 8, 10};
        long[] result = p.solution(param1, param2);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase2() {
        int param1 = 4;
        int param2 = 3;
        long[] expected = new long[]{4,8,12};
        long[] result = p.solution(param1, param2);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase3() {
        int param1 = -4;
        int param2 = 2;
        long[] expected = new long[]{-4, -8};
        long[] result = p.solution(param1, param2);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase4() {
        int param1 = 0;
        int param2 = 2;
        long[] expected = new long[]{0, 0};
        long[] result = p.solution(param1, param2);
        assertArrayEquals(expected, result);
    }
}