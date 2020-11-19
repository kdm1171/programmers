package com.jade.programmers.practice.level1;


import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12947
 * 문제 설명
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 * <p>
 * 제한 조건
 * x는 1 이상, 10000 이하인 정수입니다.
 */
public class P_하샤드_수 {
    public boolean solution(int x) {
        System.out.println(sum(x));
        return x % sum(x) == 0;
    }

    private int sum(int n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        Stream<String> stream = IntStream.range(0, chars.length).mapToObj(i -> String.valueOf(chars[i]));
        return stream
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
