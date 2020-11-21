package com.jade.programmers.practice.level1;


import java.util.Stack;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/64061
 */
public class P_크레인_인형뽑기_게임 {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int len = board.length;
        int answer = 0;
        for (int i : moves) {
            for (int j = 0; j < len; j++) {
                int entry = board[j][i - 1];
                if (entry != 0) {
                    board[j][i - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == entry) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(entry);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
