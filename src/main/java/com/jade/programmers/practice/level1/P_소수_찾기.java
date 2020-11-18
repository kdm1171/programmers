package com.jade.programmers.practice.level1;


/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12921
 * 문제 설명
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
 * <p>
 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
 * (1은 소수가 아닙니다.)
 * <p>
 * 제한 조건
 * n은 2이상 1000000이하의 자연수입니다.
 */
public class P_소수_찾기 {
    public int solution(int n) {
        boolean[] notPrimeNumbers = new boolean[n + 1];
        notPrimeNumbers[0] = true;
        notPrimeNumbers[1] = true;

        for (int i = 2; i < n; i++) {
            if (notPrimeNumbers[i]) {
                continue;
            }

            for (int j = i + i; j <= n; j += i) {
                notPrimeNumbers[j] = true;
            }
        }
        int count = 0;
        for (boolean b : notPrimeNumbers) {
            if (!b) {
                count++;
            }
        }
        return count;
    }
}
