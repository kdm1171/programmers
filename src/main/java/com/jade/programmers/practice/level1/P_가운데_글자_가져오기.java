package com.jade.programmers.practice.level1;

/**
 * 문제주소 - https://programmers.co.kr/learn/courses/30/lessons/12903
 * 문제 설명
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * <p>
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 */
public class P_가운데_글자_가져오기 {

    public String solution(String s) {
        String answer = "";

        int len = s.length();
        int offset = len / 2;
        if (len % 2 == 0) {
            answer += s.charAt(offset - 1);
            answer += s.charAt(offset);
        } else {
            answer += s.charAt(offset);
        }

        return answer;
    }
}
