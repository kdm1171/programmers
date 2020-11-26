# https://programmers.co.kr/learn/courses/30/lessons/12941

def solution(A, B):
    answer = 0
    a = sorted(A)
    b = sorted(B, reverse=True)
    for i in range(len(a)):
        answer += a[i] * b[i]
    return answer


if __name__ == '__main__':
    print(solution([1, 4, 2], [5, 4, 4]))
    print(solution([1, 2], [3, 4]))
