package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_정수_제곱근_판별Test {


    P_정수_제곱근_판별 p;
    @Before
    public void setUp() throws Exception {
        p = new P_정수_제곱근_판별();
    }

    @Test
    public void testCase1(){
        long param = 121;
        long expected = 144;

        long result = p.solution(param);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2(){
        long param = 3;
        long expected = -1;

        long result = p.solution(param);

        assertEquals(expected, result);
    }
}