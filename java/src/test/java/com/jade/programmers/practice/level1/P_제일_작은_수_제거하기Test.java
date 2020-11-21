package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_제일_작은_수_제거하기Test {

    P_제일_작은_수_제거하기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_제일_작은_수_제거하기();
    }

    @Test
    public void testCase1() {
        int[] param = {4, 3, 2, 1};

        int[] expected = {4, 3, 2};

        int[] result = p.solution(param);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase2() {
        int[] param = {10};

        int[] expected = {-1};

        int[] result = p.solution(param);

        assertArrayEquals(expected, result);
    }
}