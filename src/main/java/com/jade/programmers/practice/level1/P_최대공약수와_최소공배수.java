package com.jade.programmers.practice.level1;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12940
 * 문제 설명
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 * <p>
 * 제한 사항
 * 두 수는 1이상 1000000이하의 자연수입니다.
 */
public class P_최대공약수와_최소공배수 {
    public int[] solution(int n, int m) {
        int gcd = findGcd(n, m);
        int lcm = calcLcm(n, m, gcd);
        return new int[]{gcd, lcm};
    }

    private int findGcd(int a, int b) {
        return (a % b == 0 ? b : findGcd(b, a % b));
    }

    private int calcLcm(int a, int b, int gcd) {
        return a * b / gcd;
    }
}
