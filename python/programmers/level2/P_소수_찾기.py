# https://programmers.co.kr/learn/courses/30/lessons/42839

from itertools import permutations


def isPrimeNumber(n):
    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


def solution(numbers):
    answer = 0
    l = [str(i) for i in numbers]
    s = {0}
    for i in range(len(numbers) + 1):
        p = list(map(''.join, permutations(l, i)))
        if p == ['']:
            continue
        s.update(list(map(int, p)))
    for i in s:
        if isPrimeNumber(int(i)):
            print
            answer += 1

    return answer

if __name__ == '__main__':
    print(solution("17"))
    print(solution("011"))
