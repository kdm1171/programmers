# https://programmers.co.kr/learn/courses/30/lessons/17679


def printBoard(board):
    for i in board:
        for j in i:
            print(j, end='')
        print()


def makeBoard(m, n, board):
    b = [['0'] * n for i in range(m)]
    for i in range(m):
        for j in range(n):
            b[i][j] = board[i][j]
    return b


def falldownBlocks(m, n, board):
    fallCount = 0
    for i in range(n):
        for j in range(m)[::-1]:
            if board[j][i] != 0:
                for k in range(j, m)[::-1]:
                    if board[k][i] == 0:
                        fallCount += 1
                        tmp = board[j][i]
                        board[j][i] = board[k][i]
                        board[k][i] = tmp

    return board, fallCount


def searchAndReplaceBlock(m, n, board):
    matchList = set()
    for i in range(0, m - 1):
        for j in range(0, n - 1):
            if board[i][j] == board[i][j + 1] == board[i + 1][j] == board[i + 1][j + 1]:
                if board[i][j] == 0:
                    continue
                matchList.add((i, j))
                matchList.add((i, j + 1))
                matchList.add((i + 1, j))
                matchList.add((i + 1, j + 1))

    for i, j in matchList:
        board[i][j] = 0

    return board, len(matchList)


def solution(m, n, board):
    answer = 0
    board = makeBoard(m, n, board)
    board, matchCount = searchAndReplaceBlock(m, n, board)
    board, fallCount = falldownBlocks(m, n, board)
    answer += matchCount

    while matchCount > 0 or fallCount > 0:
        board, matchCount = searchAndReplaceBlock(m, n, board)
        board, fallCount = falldownBlocks(m, n, board)
        answer += matchCount

    return answer


if __name__ == '__main__':
    print(solution(4, 5, ["CCBDE", "AAADE", "AAABF", "CCBBF"]))
    print(solution(6, 6, ["TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"]))

    print(solution(5, 6, ["AAAAAA",
                          "BBAATB",
                          "BBAATB",
                          "JJJTAA",
                          "JJJTAA"]))
