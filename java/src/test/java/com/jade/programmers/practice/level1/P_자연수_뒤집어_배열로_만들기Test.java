package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_자연수_뒤집어_배열로_만들기Test {

    P_자연수_뒤집어_배열로_만들기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_자연수_뒤집어_배열로_만들기();
    }

    @Test
    public void testCase1() {

        int param = 12345;

        int[] expected = {5, 4, 3, 2, 1};

        int[] result = p.solution(param);

        assertArrayEquals(expected, result);
    }
}