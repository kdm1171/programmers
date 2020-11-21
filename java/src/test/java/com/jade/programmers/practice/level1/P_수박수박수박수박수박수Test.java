package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_수박수박수박수박수박수Test {

    P_수박수박수박수박수박수 p;
    @Before
    public void setUp() throws Exception {
        p = new P_수박수박수박수박수박수();
    }

    @Test
    public void testCase1(){
        int param = 3;

        String expected = "수박수";

        String result = p.solution(param);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2(){
        int param = 4;

        String expected = "수박수박";

        String result = p.solution(param);

        assertEquals(expected, result);
    }
}