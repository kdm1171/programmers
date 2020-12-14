# https://programmers.co.kr/learn/courses/30/lessons/12980

def solution(n):
    ans = 0
    while 1 < n:
        n, m = divmod(n, 2)
        ans += m
    return ans + 1


if __name__ == '__main__':
    print(solution(5))
    print(solution(6))
    print(solution(5000))
