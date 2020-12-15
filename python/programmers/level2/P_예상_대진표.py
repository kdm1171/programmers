# https://programmers.co.kr/learn/courses/30/lessons/12985

def solution(n, a, b):
    answer = int(format(n, 'b').count('0'))
    count = 0
    start = 1
    end = n
    for i in range(answer):
        pivot = start + end
        pivot /= 2
        if (a < pivot < b) or (a > pivot > b):
            return answer - count
        if a > pivot and b > pivot:
            start = pivot
        if a < pivot and b < pivot:
            end = pivot
        count += 1
    return answer


if __name__ == '__main__':
    print(solution(8, 4, 7))
    print(solution(8, 1, 2))
    print(solution(8, 7, 8))
    print(solution(16, 9, 12))
