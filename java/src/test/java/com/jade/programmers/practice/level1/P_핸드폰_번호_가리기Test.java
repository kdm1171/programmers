package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_핸드폰_번호_가리기Test {

    P_핸드폰_번호_가리기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_핸드폰_번호_가리기();
    }

    @Test
    public void testCase1() {
        String param = "01033334444";

        String expected = "*******4444";

        String result = p.solution(param);

        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        String param = "027778888";

        String expected = "*****8888";

        String result = p.solution(param);

        assertEquals(expected, result);
    }
}