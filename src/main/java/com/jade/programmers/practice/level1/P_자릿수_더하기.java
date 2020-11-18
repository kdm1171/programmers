package com.jade.programmers.practice.level1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12931
 * 문제 설명
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 * <p>
 * 제한사항
 * N의 범위 : 100,000,000 이하의 자연수
 */
public class P_자릿수_더하기 {
    public int solution(int n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        Stream<String> stream = IntStream.range(0, chars.length).mapToObj(i -> String.valueOf(chars[i]));
        return stream
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
