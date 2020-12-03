# https://programmers.co.kr/learn/courses/30/lessons/42626

import heapq


def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)

    while True:
        e1 = heapq.heappop(scoville)
        if e1 > K:
            break
        if len(scoville) < 1:
            return -1
        e2 = heapq.heappop(scoville)
        heapq.heappush(scoville, e1 + (e2 * 2))
        answer += 1

    return answer


if __name__ == '__main__':
    print(solution([1, 2, 3, 9, 10, 12], 7))
