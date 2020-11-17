package com.jade.programmers.practice.level1;


import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12917
 * 문제 설명
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 * <p>
 * 제한 사항
 * str은 길이 1 이상인 문자열입니다.
 */
public class P_문자열_내림차순으로_배치하기 {

    public String solution(String s) {
        char[] chars = s.toCharArray();

        Stream<Character> cStream = IntStream.range(0, chars.length).mapToObj(i -> chars[i]);

        return cStream
                .sorted(Comparator.reverseOrder())
                .collect(Collector.of(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString));
    }
}
