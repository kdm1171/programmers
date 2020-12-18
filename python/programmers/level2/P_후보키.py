# https://programmers.co.kr/learn/courses/30/lessons/42890
from itertools import combinations


# 한번 후보키에 사용된 키는 다른 후보키에 포함되지 않는다고 가정하고 코딩햇으나 실패.
# def solution(relation):
#     answer = 0
#     column = [i for i in range(len(relation[0]))]
#     rowCount = len(relation)
#
#     tupleLen = 1
#     while tupleLen <= len(column):
#         candidates = []
#         comb = combinations(column, tupleLen)
#         for j in comb:
#             s = set()
#             for i in range(len(relation)):
#                 t = tuple([relation[i][j[k]] for k in range(tupleLen)])
#                 s.add(t)
#             if rowCount == len(s):
#                 candidates.append(j)
#
#         answer += len(candidates)
#
#         for i in candidates:
#             for j in range(tupleLen):
#                 if i[j] in column:
#                     column.remove(i[j])
#
#         tupleLen += 1
#
#     return answer

def solution(relation):
    column = [i for i in range(len(relation[0]))]
    rowCount = len(relation)
    comb = map(list, [combinations(range(len(column)), i + 1) for i in column])
    candidates = []
    for i in comb:
        candidates.extend(i)

    uniqueness = []
    for i in candidates:
        tmp = set([tuple([k[j] for j in i]) for k in relation])
        if len(tmp) == rowCount:
            uniqueness.append(i)

    answer = set(uniqueness)
    for i in range(len(uniqueness)):
        for j in range(i + 1, len(uniqueness)):
            if set(uniqueness[i]).issubset(set(uniqueness[j])):
                answer.discard(uniqueness[j])

    return len(answer)


if __name__ == '__main__':
    print(solution([["100", "ryan", "music", "2"],
                    ["200", "apeach", "math", "2"],
                    ["300", "tube", "computer", "3"],
                    ["400", "con", "computer", "4"],
                    ["500", "muzi", "music", "3"],
                    ["600", "apeach", "music", "2"]]))

    print(solution([["100", "ryan", "music", "2", 'A'],
                    ["200", "apeach", "math", "2", 'B'],
                    ["300", "tube", "computer", "3", 'C'],
                    ["400", "con", "computer", "4", 'D'],
                    ["500", "muzi", "music", "3", 'E'],
                    ["600", "apeach", "music", "2", 'F']]))

    print(solution([["100", "ryan", "music", "2", 'A', '이', '뮤직', 'ab', '100'],
                    ["200", "apeach", "math", "2", 'B', '이', '매스', 'abc', '300'],
                    ["300", "tube", "computer", "3", 'C', '삼', '컴퓨터', 'abc', '200'],
                    ["400", "con", "computer", "4", 'D', '사', '컴퓨터', 'sdf', '200'],
                    ["500", "muzi", "music", "3", 'E', '삼', '뮤직', 'ab', '400'],
                    ["600", "apeach", "music", "2", 'F', '이', '뮤직', '123', '500']]))
