package com.jade.programmers.practice.level1;


import java.util.stream.IntStream;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12944
 * 문제 설명
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 * <p>
 * 제한사항
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 */
public class P_평균_구하기 {
    public double solution(int[] arr) {
        int sum = IntStream.of(arr).sum();
        return (double) sum / arr.length;
    }
}
