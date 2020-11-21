package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_정수_내림차순으로_정렬하기Test {

    P_정수_내림차순으로_정렬하기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_정수_내림차순으로_정렬하기();
    }

    @Test
    public void testCase1(){
        long param = 118372L;

        long expected = 873211L;

        long result = p.solution(param);

        assertEquals(expected, result);
    }

}