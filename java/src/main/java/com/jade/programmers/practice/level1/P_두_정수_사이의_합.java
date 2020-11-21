package com.jade.programmers.practice.level1;


import java.util.stream.IntStream;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12912
 * 문제 설명
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
 * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 * <p>
 * 제한 조건
 * a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
 * a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
 * a와 b의 대소관계는 정해져있지 않습니다.
 */
public class P_두_정수_사이의_합 {
    public long solution(int a, int b) {
        int start = Math.min(a, b);
        int end = Math.max(a, b) + 1;
        return IntStream.range(start, end).mapToLong(v -> v).sum();
    }
}
