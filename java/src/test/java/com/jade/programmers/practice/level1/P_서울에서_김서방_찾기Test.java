package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_서울에서_김서방_찾기Test {

    P_서울에서_김서방_찾기 p;

    @Before
    public void setUp() throws Exception {
        p = new P_서울에서_김서방_찾기();
    }

    @Test
    public void testCase1() {

        String expected = "김서방은 1에 있다";

        String[] param = {"Jane", "Kim"};

        String result = p.solution(param);

        assertEquals(expected, result);
    }
}