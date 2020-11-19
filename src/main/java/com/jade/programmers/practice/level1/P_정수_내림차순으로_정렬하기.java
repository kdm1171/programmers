package com.jade.programmers.practice.level1;

import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다.
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */
public class P_정수_내림차순으로_정렬하기 {

    public long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        String s = IntStream.range(0, chars.length)
                .mapToObj(i -> String.valueOf(chars[i]))
                .sorted(Comparator.reverseOrder())
                .reduce((a, b) -> a + b)
                .orElse("");
        return Long.parseLong(s);
    }
}
