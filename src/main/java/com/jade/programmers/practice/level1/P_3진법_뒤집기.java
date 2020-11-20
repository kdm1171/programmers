package com.jade.programmers.practice.level1;


import java.util.ArrayList;
import java.util.List;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/68935
 * 문제 설명
 * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 * <p>
 * 제한사항
 * n은 1 이상 100,000,000 이하인 자연수입니다.
 */
public class P_3진법_뒤집기 {
    public int solution(int n) {
        String reversedNum = transformAndReverse(n);
        return convert2to10(reversedNum);
    }

    public String transformAndReverse(int n) {
        List<String> list = new ArrayList<>();
        int quotient = n;
        while (quotient != 0) {
            list.add(String.valueOf(quotient % 3));
            quotient = quotient / 3;
        }
        return list.stream().reduce((a, b) -> a + b).orElse("");
    }

    private int convert2to10(String numString) {
        char[] chars = numString.toCharArray();
        int sum = 0;
        int p = chars.length;
        for (int i = 0; i < chars.length; i++) {
            int num = Integer.parseInt(String.valueOf(chars[i]));
            double x =Math.pow(3, p-i-1);
            sum += x * num;
        }
        return sum;
    }
}
