package com.jade.programmers.practice.level1;

import java.util.HashMap;

/**
 * 문제 주소 - https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
 * 문제 설명
 * 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
 *
 * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 전체 학생의 수는 2명 이상 30명 이하입니다.
 * 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
 * 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
 * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
 * 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
 */
public class P_체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        // 만약 lost가 없으면 n 그대로 반환
        if (lost.length == 0) return n;

        // lost, reserve를 hashMap으로 관리;

        HashMap<Integer, Integer> hashMapLost = new HashMap<>();
        for (int i : lost) {
            hashMapLost.put(i, 0);
        }

        HashMap<Integer, Integer> hashMapReserve = new HashMap<>();
        for (int i : reserve) {
            hashMapReserve.put(i, 1);
        }

        int lostSize = lost.length;

        // 만약 lost 목록에 reserve와 같은 항목이 있으면 reserve 목록에서
        // 제거하고, lost 목록에서도 제거
        int dupleCount = 0;
        for (int key : hashMapLost.keySet()) {
            if (hashMapReserve.containsKey(key)) {
                hashMapLost.put(key, 1);
                hashMapReserve.put(key, 0);
                dupleCount++;
            }
        }

        lostSize -= dupleCount;


        // 경쟁관계가 없는 애들한테 체육복 빌려주기
        while (true) {
            int lent = 0;
            // lost 기준으로 앞뒤를 탐색해서, 앞뒤 둘다 있으면 일단 패스
            // 앞이나, 뒤 한곳만 있으면 해당 학생한테 체육복 빌리기
            for (int key : hashMapLost.keySet()) {
                if (hashMapLost.get(key) == 1) continue;

                //중간 학생인 경우 앞뒤로 체크해서 둘다 있으면 무시하고, 한쪽애한테만 빌림
                int prevKey = key - 1;
                int nextKey = key + 1;

                boolean prev = false;
                boolean next = false;

                if (hashMapReserve.containsKey(prevKey)) {
                    prev = hashMapReserve.get(prevKey) == 1;
                }
                if (hashMapReserve.containsKey(nextKey)) {
                    next = hashMapReserve.get(nextKey) == 1;
                }

                if (!prev && next) {
                    // 다음사람 한테서 빌리기
                    hashMapLost.put(key, 1);
                    hashMapReserve.put(nextKey, 0);
                    lent++;

                } else if (prev && !next) {
                    // 이전사람 한테서 빌리기
                    hashMapLost.put(key, 1);
                    hashMapReserve.put(prevKey, 0);
                    lent++;
                }
            }

            lostSize -= lent;
            if (lent == 0) { // 빌려준 체육복의 갯수가 0이면 루프 탈출
                break;
            }
        }


        // 이제 순회하면서 아무나 한테 그냥 빌려줘
        // 더이상 빌려줄 애들이 없을때까지
        while (true) {
            int lent = 0;

            for (int key : hashMapLost.keySet()) {
                if (hashMapLost.get(key) == 1) continue;

                // 앞, 뒷사람한테 물어보기
                if (hashMapReserve.containsKey(key - 1) && hashMapReserve.get(key - 1) == 1) {
                    hashMapLost.put(key, 1);
                    hashMapReserve.put(key - 1, 0);
                    lent++;
                }else if (hashMapReserve.containsKey(key + 1) && hashMapReserve.get(key + 1) == 1) {
                    hashMapLost.put(key, 1);
                    hashMapReserve.put(key - 1, 0);
                    lent++;
                }

            }

            lostSize -= lent;
            if (lent == 0) break;

        }

        // 마지막 개수는 총합 빼기 잃어버린애들 수
        answer = n - lostSize;

        return answer;
    }
}
