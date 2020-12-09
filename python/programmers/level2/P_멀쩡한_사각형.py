# https://programmers.co.kr/learn/courses/30/lessons/62048
from math import gcd


def solution(w, h):
    return (w * h) - (w + h - gcd(w, h))


if __name__ == '__main__':
    print(solution(8, 12))
    print(solution(2, 5))
