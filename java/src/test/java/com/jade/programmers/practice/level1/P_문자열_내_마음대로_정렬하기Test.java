package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_문자열_내_마음대로_정렬하기Test {

    P_문자열_내_마음대로_정렬하기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_문자열_내_마음대로_정렬하기();
    }

    @Test
    public void testCase1() {
        String[] strings = new String[]{"sun", "bed", "car"};
        int n = 1;

        String[] expected = new String[]{"car", "bed", "sun"};

        String[] result = p.solution(strings, n);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase2() {
        String[] strings = new String[]{"abce", "abcd", "cdx"};
        int n = 2;

        String[] expected = new String[]{"abcd", "abce", "cdx"};

        String[] result = p.solution(strings, n);

        assertArrayEquals(expected, result);
    }
}