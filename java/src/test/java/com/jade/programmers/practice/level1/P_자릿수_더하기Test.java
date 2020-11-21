package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_자릿수_더하기Test {

    P_자릿수_더하기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_자릿수_더하기();
    }

    @Test
    public void testCase1() {
        int param = 123;
        int expected = 6;

        int result = p.solution(param);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        int param = 987;
        int expected = 24;

        int result = p.solution(param);

        assertEquals(expected, result);
    }
}