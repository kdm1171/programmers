package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_완주하지_못한_선수Test {

    P_완주하지_못한_선수 p;

    @Before
    public void setUp() throws Exception {
        p = new P_완주하지_못한_선수();
    }

    @Test
    public void testCase1() {
        String[] param1 = {"leo", "kiki", "eden"};
        String[] param2 = {"eden", "kiki"};
        String expected = "leo";
        String result = p.solution(param1, param2);
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        String[] param1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] param2 = {"josipa", "filipa", "marina", "nikola"};
        String expected = "vinko";
        String result = p.solution(param1, param2);
        assertEquals(expected, result);
    }

    @Test
    public void testCase3() {
        String[] param1 = {"mislav", "stanko", "mislav", "ana"};
        String[] param2 = {"stanko", "ana", "mislav"};
        String expected = "mislav";
        String result = p.solution(param1, param2);
        assertEquals(expected, result);
    }

}