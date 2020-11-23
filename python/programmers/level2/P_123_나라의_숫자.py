# https://programmers.co.kr/learn/courses/30/lessons/12899

def solution(n):
    remainders = []
    divider = 3
    while True:
        quotient, remainder = divmod(n, divider)
        if remainder == 0:
            quotient -= 1
            remainders.append(4)
        else:
            remainders.append(remainder)

        n = quotient
        if n < divider:
            break

    if n > 0:
        remainders.append(n)

    remainders.reverse()

    return ''.join(map(str, remainders))


if __name__ == '__main__':
    print(solution(1))
    print(solution(2))
    print(solution(3))
    print(solution(4))
    print(solution(5))
    print(solution(6))
    print(solution(7))
    print(solution(8))
    print(solution(9))
    print(solution(10))
