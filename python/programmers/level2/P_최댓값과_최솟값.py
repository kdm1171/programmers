# https://programmers.co.kr/learn/courses/30/lessons/12939

def solution(s):
    l = list(map(int, s.split()))
    return f'{min(l)} {max(l)}'


if __name__ == '__main__':
    print(solution("1 2 3 4"))
    print(solution("-1 -2 -3 -4"))
    print(solution("-1 -1"))
