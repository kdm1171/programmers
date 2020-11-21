package com.jade.programmers.practice.level1;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12932
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 * <p>
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 */
public class P_자연수_뒤집어_배열로_만들기 {

    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        char[] chars = s.toCharArray();

        int index = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            answer[index++] = Integer.parseInt(String.valueOf(chars[i]));
        }
        return answer;
    }
}
