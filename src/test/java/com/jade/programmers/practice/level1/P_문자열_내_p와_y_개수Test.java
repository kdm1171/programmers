package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_문자열_내_p와_y_개수Test {

    P_문자열_내_p와_y_개수 p;

    @Before
    public void setUp() throws Exception {
        p = new P_문자열_내_p와_y_개수();
    }


    @Test
    public void testCase1(){
        String param = "pPoooyY";

        boolean expected = true;

        boolean result = p.solution(param);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2(){
        String param = "Pyy";

        boolean expected = false;

        boolean result = p.solution(param);

        assertEquals(expected, result);
    }

}