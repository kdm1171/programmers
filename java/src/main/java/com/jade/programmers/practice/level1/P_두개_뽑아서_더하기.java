package com.jade.programmers.practice.level1;

import java.util.HashSet;
import java.util.Set;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/68644
 * 문제 설명
 * 정수 배열 numbers가 주어집니다.
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 */
public class P_두개_뽑아서_더하기 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (i == j) continue;
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(v -> v).toArray();
    }
}
