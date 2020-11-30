# https://programmers.co.kr/learn/courses/30/lessons/12951


def solution(s):
    l = []
    flag = True
    for c in s:
        if ' ' == c:
            flag = True
            l.append(c.lower())
        elif flag:
            flag = False
            l.append(c.upper())
        else:
            l.append(c.lower())
    return ''.join(l)


if __name__ == '__main__':
    print(solution("3people unFollowed me"))
    print(solution(" for the last week"))
