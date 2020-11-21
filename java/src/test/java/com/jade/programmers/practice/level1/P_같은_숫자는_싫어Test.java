package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_같은_숫자는_싫어Test {

    P_같은_숫자는_싫어 p;

    @Before
    public void setUp() throws Exception {
        p = new P_같은_숫자는_싫어();
    }

    @Test
    public void testCase1() {

        int[] expected = new int[]{1, 3, 0, 1};

        int[] result = p.solution(new int[]{1, 1, 3, 3, 0, 1, 1});

        assertArrayEquals(expected, result);
    }
}