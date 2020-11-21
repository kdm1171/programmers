package com.jade.programmers.practice.level1;

import java.util.Arrays;
import java.util.List;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/67256
 */
public class P_키_패드_누르기 {
    public String solution(int[] numbers, String hand) {
        List<Integer> left = Arrays.asList(1, 4, 7);
        List<Integer> right = Arrays.asList(3, 6, 9);
        boolean isRightHand = "right".equals(hand);
        int leftPosition = 10;
        int rightPosition = 12;

        StringBuilder sb = new StringBuilder();

        for (int num : numbers) {
            if (num == 0) num = 11;
            if (left.contains(num)) {
                // left
                sb.append("L");
                leftPosition = num;
            } else if (right.contains(num)) {
                //right
                sb.append("R");
                rightPosition = num;
            } else {
                // both
                int leftDist = calcDist(num, leftPosition);
                int rightDist = calcDist(num, rightPosition);
                if (leftDist < rightDist) { // left
                    sb.append("L");
                    leftPosition = num;
                } else if (rightDist < leftDist) { // right
                    sb.append("R");
                    rightPosition = num;
                } else {
                    // same
                    if (isRightHand) {
                        sb.append("R");
                        rightPosition = num;
                    } else {
                        sb.append("L");
                        leftPosition = num;
                    }
                }
            }
        }
        return sb.toString();
    }

    private int calcDist(int num, int position) {
        int[][] keypad = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int[] numPos = new int[2];
        int[] posPos = new int[2];

        for (int i = 0; i < keypad.length; i++) {
            for (int j = 0; j < keypad[i].length; j++) {
                if (num == keypad[i][j]) {
                    numPos[0] = i;
                    numPos[1] = j;
                }
                if (position == keypad[i][j]) {
                    posPos[0] = i;
                    posPos[1] = j;
                }
            }
        }

        return (Math.abs(numPos[0] - posPos[0])) + (Math.abs(numPos[1] - posPos[1]));

    }

}
