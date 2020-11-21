package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_콜라츠_추측Test {

    P_콜라츠_추측 p;

    @Before
    public void setUp() throws Exception {
        p = new P_콜라츠_추측();
    }

    @Test
    public void testCase1(){
        int param1 = 6;

        int expected = 8;

        int result = p.solution(param1);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2(){
        int param1 = 16;

        int expected = 4;

        int result = p.solution(param1);

        assertEquals(expected, result);
    }

    @Test
    public void testCase3(){
        int param1 = 626331;

        int expected = -1;

        int result = p.solution(param1);

        assertEquals(expected, result);
    }


}