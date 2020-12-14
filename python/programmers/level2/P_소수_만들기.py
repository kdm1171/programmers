# https://programmers.co.kr/learn/courses/30/lessons/12977

from itertools import combinations


def isPrimeNumber(n):
    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


def solution(nums):
    answer = 0

    c = combinations(nums, 3)
    candidates = []
    for i in c:
        candidate = sum(i)
        candidates.append(candidate)
    for i in candidates:
        if isPrimeNumber(i):
            answer += 1
    return answer


if __name__ == '__main__':
    print(solution([1, 2, 3, 4]))
    print(solution([1, 2, 7, 6, 4]))
