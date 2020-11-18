package com.jade.programmers.practice.level1;


/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12922
 * 문제 설명
 * 길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
 * 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
 * <p>
 * 제한 조건
 * n은 길이 10,000이하인 자연수입니다.
 */
public class P_수박수박수박수박수박수 {
    public String solution(int n) {
        String[] waterMelon = {"수", "박"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(waterMelon[i % 2]);
        }
        return sb.toString();
    }
}
