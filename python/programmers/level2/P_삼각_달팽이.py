# https://programmers.co.kr/learn/courses/30/lessons/68645

def solution(n):
    triangle = [[0] * n for _ in range(n)]

    total = sum(range(n + 1))
    count = 0
    for i in range(n):
        count += 1
        triangle[i][0] = count
    for i in range(1, n):
        count += 1
        triangle[n - 1][i] = count
    for i in range(n - 2, 0, -1):
        count += 1
        triangle[i][i] = count

    i, j = 1, 1
    mode = 1
    while count < total:
        if mode == 1:
            # 아래로
            if triangle[i + 1][j] == 0:
                i += 1
                count += 1
                triangle[i][j] = count
            else:
                mode = 2
        if mode == 2:
            # 오른쪽으로
            if triangle[i][j + 1] == 0:
                j += 1
                count += 1
                triangle[i][j] = count
            else:
                mode = 3
        if mode == 3:
            # 위로
            if triangle[i - 1][j - 1] == 0:
                i -= 1
                j -= 1
                count += 1
                triangle[i][j] = count
            else:
                mode = 1

    answer = []
    for l in triangle:
        for j in l:
            if j != 0:
                answer.append(j)
    return answer


if __name__ == '__main__':
    print(solution(999))
