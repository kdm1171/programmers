package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_2016년Test {

    P_2016년 p;

    @Before
    public void setUp() throws Exception {
        p = new P_2016년();
    }

    @Test
    public void testCase1(){
        String day = p.solution(5, 24);

        assertEquals("TUE", day);

    }
}