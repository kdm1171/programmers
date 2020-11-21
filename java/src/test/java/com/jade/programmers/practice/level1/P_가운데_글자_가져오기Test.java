package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_가운데_글자_가져오기Test {

    P_가운데_글자_가져오기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_가운데_글자_가져오기();
    }

    @Test
    public void testCase1(){
        String expected = "c";

        String result = p.solution("abcde");

        assertEquals(expected, result);
    }

    @Test
    public void testCase2(){
        String expected = "we";

        String result = p.solution("qwer");

        assertEquals(expected, result);
    }
}