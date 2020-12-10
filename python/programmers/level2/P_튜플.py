# https://programmers.co.kr/learn/courses/30/lessons/64065
import re


def solution(s):
    s = s[2:len(s) - 2]
    tupleList = re.split('},{', s)
    tupleList.sort(key=len)
    answer = []
    for i in tupleList:
        for j in i.split(','):
            if not j in answer:
                answer.append(j)

    return list(map(int, answer))


if __name__ == '__main__':
    print(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"))
    print(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"))
    print(solution("{{20,111},{111}}"))
    print(solution("{{123}}"))
    print(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"))
