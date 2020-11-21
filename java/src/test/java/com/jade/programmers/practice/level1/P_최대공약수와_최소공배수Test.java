package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_최대공약수와_최소공배수Test {

    P_최대공약수와_최소공배수 p;

    @Before
    public void setUp() throws Exception {
        p = new P_최대공약수와_최소공배수();
    }

    @Test
    public void testCase1(){
        int param1 = 3;
        int param2 = 12;

        int[] expected = {3, 12};

        int[] result = p.solution(param1, param2);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testCase2(){
        int param1 = 2;
        int param2 = 5;

        int[] expected = {1, 10};

        int[] result = p.solution(param1, param2);

        assertArrayEquals(expected, result);
    }

}