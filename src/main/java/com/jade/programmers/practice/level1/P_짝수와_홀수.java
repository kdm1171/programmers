package com.jade.programmers.practice.level1;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12937
 * 문제 설명
 * 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * num은 int 범위의 정수입니다.
 * 0은 짝수입니다.
 */
public class P_짝수와_홀수 {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
