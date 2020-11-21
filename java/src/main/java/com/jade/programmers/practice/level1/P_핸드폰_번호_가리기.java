package com.jade.programmers.practice.level1;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12948
 * 문제 설명
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 * <p>
 * 제한 조건
 * s는 길이 4 이상, 20이하인 문자열입니다.
 */
public class P_핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        int len = phone_number.length() - 4;
        String lastNumber = phone_number.substring(len);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append("*");
        }
        return sb.append(lastNumber).toString();
    }
}
