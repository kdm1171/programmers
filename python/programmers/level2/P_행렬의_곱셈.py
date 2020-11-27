# https://programmers.co.kr/learn/courses/30/lessons/12949

def solution(arr1, arr2):
    m = len(arr1)  # row
    n = len(arr2[0])  # col
    l = len(arr1[0])
    answer = [[0] * n for _ in range(m)]

    for i in range(m):
        for j in range(n):
            for k in range(l):
                answer[i][j] += arr1[i][k] * arr2[k][j]

    return answer


if __name__ == '__main__':
    print(solution([[1, 4], [3, 2], [4, 1]], [[3, 3], [3, 3]]))
    print(solution([[2, 3, 2], [4, 2, 4], [3, 1, 4]], [[5, 4, 3], [2, 4, 1], [3, 1, 1]]))
