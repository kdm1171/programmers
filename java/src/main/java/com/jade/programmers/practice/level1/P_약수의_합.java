package com.jade.programmers.practice.level1;


import java.util.stream.IntStream;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12928
 * 문제 설명
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 * <p>
 * 제한 사항
 * n은 0 이상 3000이하인 정수입니다.
 */
public class P_약수의_합 {
    public int solution(int n) {
        return IntStream.range(1, n + 1)
                .filter(x -> n % x == 0)
                .sum();
    }
}
