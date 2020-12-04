# https://programmers.co.kr/learn/courses/30/lessons/42746?language=python3
import functools


def compare(a, b):
    c1 = a + b
    c2 = b + a
    return int(c1) - int(c2)


def solution(numbers):
    sortedList = sorted(map(str, numbers), reverse=True, key=functools.cmp_to_key(compare))
    return str(int(''.join(sortedList)))


if __name__ == '__main__':
    print(solution([6, 10, 2]))
    print(solution([3, 30, 34, 5, 9]))
    print(solution([0, 0]))
