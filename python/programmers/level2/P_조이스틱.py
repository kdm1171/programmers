# https://programmers.co.kr/learn/courses/30/lessons/42860

def countOfUpAndDown(name):
    l = [name[i] for i in range(len(name))]
    count = 0
    for i in range(len(l)):
        c = ord(l[i]) - ord('A')
        count += min(26 - c, c)
    return count


def checkAllVisited(visited):
    for i in range(len(visited)):
        if not visited[i]:
            return False
    return True


def calcMoves(reverseIndex, name):
    visited = []
    for i in name:
        visited.append(i == 'A')

    index = 0
    inc = 1
    count = 0
    while True:
        count += 1
        if index == reverseIndex:
            inc = -1
        visited[index] = True
        index += inc
        if index < 0:
            index = len(visited) - 1

        if checkAllVisited(visited):
            break

    return count


def countOfMoves(name):
    moves = []
    for i in range(len(name)):
        moves.append(calcMoves(i, name))
    return min(moves)


def solution(name):
    return countOfUpAndDown(name) + countOfMoves(name) - 1


if __name__ == '__main__':
    print(solution("JEROEN"))
    print(solution("JAN"))
    print(solution('AAAAAAAA'))
    print(solution('AABAAAAA'))
    print(solution("ABAAAAABAB"))
    print(solution('BABAAAAB'))
    print(solution("BBABAAAB"))
