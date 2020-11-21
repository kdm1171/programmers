package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_키_패드_누르기Test {

    P_키_패드_누르기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_키_패드_누르기();
    }

    @Test
    public void testCase1() {
        int[] param = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String expected = "LRLLLRLLRRL";

        String result = p.solution(param, hand);

        assertEquals(expected, result);
    }
}