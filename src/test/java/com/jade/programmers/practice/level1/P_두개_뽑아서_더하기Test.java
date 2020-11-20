package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_두개_뽑아서_더하기Test {

    P_두개_뽑아서_더하기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_두개_뽑아서_더하기();
    }

    @Test
    public void testCase1() {
        int[] param = {2, 1, 3, 4, 1};

        int[] expected = {2, 3, 4, 5, 6, 7};

        int[] result = p.solution(param);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase2() {
        int[] param = {5, 0, 2, 7};

        int[] expected = {2, 5, 7, 9, 12};

        int[] result = p.solution(param);

        assertArrayEquals(expected, result);
    }

}