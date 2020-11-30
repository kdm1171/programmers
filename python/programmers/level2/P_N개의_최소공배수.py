# https://programmers.co.kr/learn/courses/30/lessons/12953

from math import gcd


def solution(arr):
    lcm = arr[0]
    for n in arr[1:]:
        lcm = int(lcm * n / gcd(lcm, n))

    return lcm


if __name__ == '__main__':
    print(solution([2, 6, 8, 14]))
    print(solution([1, 2, 3]))
