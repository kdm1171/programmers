# https://programmers.co.kr/learn/courses/30/lessons/70129
import re


def transform(s, tryCount, matchCount):
    if s == '1':
        return tryCount, matchCount
    matchCount += len(re.findall('0', s))
    return transform(str(bin(len(re.sub('0', '', s))))[2:], tryCount + 1, matchCount)


def solution(s):
    return transform(s, 0, 0)


if __name__ == '__main__':
    print(solution("110010101001"))
    print(solution("01110"))
    print(solution("1111111"))
