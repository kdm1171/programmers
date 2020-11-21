package com.jade.programmers.practice.level1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_크레인_인형뽑기_게임Test {

    P_크레인_인형뽑기_게임 p;

    @Before
    public void setUp() throws Exception {
        p = new P_크레인_인형뽑기_게임();
    }

    @Test
    public void testCase1() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int expected = 4;

        int result = p.solution(board, moves);

        assertEquals(expected, result);
    }
}