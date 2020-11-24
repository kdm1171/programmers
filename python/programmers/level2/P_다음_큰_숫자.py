def convert(n):
    return sum([int(i) for i in format(n, 'b')])


def solution(n):
    origin = convert(n)
    while True:
        n += 1
        if origin == convert(n):
            answer = n
            break
    return answer


if __name__ == '__main__':
    print(solution(78))
    print(solution(15))
