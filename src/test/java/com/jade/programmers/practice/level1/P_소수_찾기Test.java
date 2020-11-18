package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_소수_찾기Test {

    P_소수_찾기 p;
    @Before
    public void setUp() throws Exception {
        p = new P_소수_찾기();
    }

    @Test
    public void testCase1(){
        int expected = 4;

        int param = 10;

        int result = p.solution(param);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2(){
        int expected = 3;

        int param = 5;

        int result = p.solution(param);

        assertEquals(expected, result);
    }

}