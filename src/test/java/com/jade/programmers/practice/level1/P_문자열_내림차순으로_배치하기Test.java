package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_문자열_내림차순으로_배치하기Test {

    P_문자열_내림차순으로_배치하기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_문자열_내림차순으로_배치하기();
    }

    @Test
    public void testCase1(){
        String param = "Zbcdefg";

        String expected = "gfedcbZ";

        String result = p.solution(param);

        assertEquals(expected, result);
    }
}