# https://programmers.co.kr/learn/courses/30/lessons/17677
import re


def solution(str1, str2):
    pattern = '[A-Z|a-z]'
    multiSet1 = []
    multiSet2 = []
    for i in range(1, len(str1)):
        s = ''.join(str1[i - 1:i + 1]).upper()
        if len(re.findall(pattern, s)) == 2:
            multiSet1.append(s)

    for i in range(1, len(str2)):
        s = ''.join(str2[i - 1:i + 1]).upper()
        if len(re.findall(pattern, s)) == 2:
            multiSet2.append(s)
    sorted(multiSet1)
    sorted(multiSet2)

    intersections = []
    unions = []
    for i in multiSet1:
        if i in multiSet2:
            intersections.append(i)
            multiSet2.remove(i)
        unions.append(i)
    for i in multiSet2:
        unions.append(i)

    a = len(intersections)
    b = len(unions)

    if a == b:
        return 65536
    return int(a / b * 65536)


if __name__ == '__main__':
    print(solution("FRANCE", "french"))
    print(solution("french", "FRANCE"))
    print()

    print(solution("handshake", "shake hands"))
    print(solution("shake hands", "handshake"))
    print()

    print(solution("aa1+aa2", "AAAA12"))
    print(solution("AAAA12", "aa1+aa2"))
    print()

    print(solution("E=M*C^2", "e=m*c^2"))
    print(solution("e=m*c^2", "E=M*C^2"))

    print(solution("AABBCCDD", "ABCDDCC"))
