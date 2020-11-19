package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_하샤드_수Test {

    P_하샤드_수 p;

    @Before
    public void setUp() throws Exception {
        p = new P_하샤드_수();
    }

    @Test
    public void testCase1() {
        int param = 10;

        boolean expected = true;

        boolean result = p.solution(param);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        int param = 12;

        boolean expected = true;

        boolean result = p.solution(param);

        assertEquals(expected, result);
    }

    @Test
    public void testCase3() {
        int param = 11;

        boolean expected = false;

        boolean result = p.solution(param);

        assertEquals(expected, result);
    }
    @Test
    public void testCase4() {
        int param = 13;

        boolean expected = false;

        boolean result = p.solution(param);

        assertEquals(expected, result);
    }

}