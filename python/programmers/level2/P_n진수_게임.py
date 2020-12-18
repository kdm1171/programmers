# https://programmers.co.kr/learn/courses/30/lessons/17687

HEX = {
    10: "A",
    11: "B",
    12: "C",
    13: "D",
    14: "E",
    15: "F",
}


def transBaseN(n, num):
    transed = []
    while num > 1:
        num, m = divmod(num, n)
        if n > 9 and m > 9:
            transed.append(HEX[m])
        else:
            transed.append(m)
    if num == 1:
        transed.append(num)
    return ''.join(map(str, transed[::-1]))


def solution(n, t, m, p):
    answer = ''
    nums = ['0']
    for i in range(t * m):
        nums.append(transBaseN(n, i))

    s = ''.join(nums)
    for i in range(p - 1, t * m, m):
        answer += s[i]
    return answer


if __name__ == '__main__':
    print(solution(2, 4, 2, 1))
    print(solution(16, 16, 2, 1))
    print(solution(16, 16, 2, 2))
