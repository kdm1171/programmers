package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_이상한_문자_만들기Test {

    P_이상한_문자_만들기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_이상한_문자_만들기();
    }

    @Test
    public void testCase1(){
        String param = "try hello world";
        String expected = "TrY HeLlO WoRlD";

        String result = p.solution(param);

        assertEquals(expected, result);
    }
}