package com.jade.programmers.practice.level1;


/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/12926
 * 문제 설명
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 * <p>
 * 제한 조건
 * 공백은 아무리 밀어도 공백입니다.
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
 * s의 길이는 8000이하입니다.
 * n은 1 이상, 25이하인 자연수입니다.
 */
public class P_시저_암호 {
    public String solution(String s, int n) {

        String[] alphabetLower = {
                "a", "b", "c", "d", "e", "f", "g", "h",
                "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z"
        };
        String[] alphabetUpper = {
                "A", "B", "C", "D", "E", "F", "G", "H",
                "I", "J", "K", "L", "M", "N", "O", "P",
                "Q", "R", "S", "T", "U", "V", "W", "X",
                "Y", "Z"
        };

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            String alphabet = String.valueOf(c);
            int index = findIndex(alphabet, alphabetLower);
            if (index == -1) {
                index = findIndex(alphabet, alphabetUpper);
                if (index == -1) {
                    sb.append(" ");
                } else {
                    sb.append(alphabetUpper[(index + n) % alphabetUpper.length]);
                }
            } else {
                sb.append(alphabetLower[(index + n) % alphabetLower.length]);
            }

        }
        return sb.toString();
    }

    private int findIndex(String s, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (s.equals(array[i])) return i;
        }
        return -1;
    }
}
