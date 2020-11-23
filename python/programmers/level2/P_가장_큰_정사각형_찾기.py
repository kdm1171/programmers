# https://programmers.co.kr/learn/courses/30/lessons/12905?language=python3

def solution(board):
    maxLen = 0
    for i in range(1, len(board)):
        for j in range(1, len(board[i])):
            # 보드 값이 0 이면 패스
            if board[i][j] == 0:
                continue

            board[i][j] = min(board[i][j - 1],
                              board[i - 1][j],
                              board[i - 1][j - 1]) + 1
            if maxLen < board[i][j]:
                maxLen = board[i][j]

    if maxLen == 0:
        for i in board:
            if sum(i) > 0:
                return 1

    return maxLen ** 2


if __name__ == '__main__':
    print(solution([[0, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1], [0, 0, 1, 0]]))
    print(solution([[0, 0, 1, 1], [1, 1, 1, 1]]))
    print(solution([[1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1]]))
    print(solution([[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]))
    print(solution([[0, 0, 0, 0],
                    [1, 0, 0, 0],
                    [0, 0, 0, 0],
                    [0, 0, 0, 0]]))
