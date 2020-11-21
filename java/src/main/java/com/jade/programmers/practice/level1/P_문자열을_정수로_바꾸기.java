package com.jade.programmers.practice.level1;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12925
 *
 * 문제 설명
 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 *
 * 제한 조건
 * s의 길이는 1 이상 5이하입니다.
 * s의 맨앞에는 부호(+, -)가 올 수 있습니다.
 * s는 부호와 숫자로만 이루어져있습니다.
 * s는 0으로 시작하지 않습니다.
 */
public class P_문자열을_정수로_바꾸기 {

    public int solution(String s) {
        String sign = s.substring(0, 0);
        int startIndex = 0;
        if(sign.equals("-") || sign.equals("+")){
            startIndex = 1;
        }
        String numberString = s.substring(startIndex);
        int number = Integer.parseInt(numberString);

        if(sign.equals("-")){
            number *= -1;
        }
        return number;
    }

}
