# https://programmers.co.kr/learn/courses/30/lessons/12913
# DP 문제
# 첫번째 리스트와 두번째 리스트를 비교해서 갈 수 있는 가장 큰 값을 찾고, 두 값을 더한 리스트를 반환하여 마지막 리스트에서 가장 큰 값을 찾음

def getNextList(list1, list2):
    result = []
    for i in range(len(list2)):
        e = 0
        for j in range(len(list1)):
            if i == j:
                continue
            if e < list1[j]:
                e = list1[j]
        result.append(list2[i] + e)
    return result


def solution(land):
    resultList = land[0]
    for i in range(1, len(land)):
        resultList = getNextList(resultList, land[i])
    answer = max(resultList)
    return answer


if __name__ == '__main__':
    print(solution([[1, 2, 3, 5],
                    [5, 6, 7, 8],
                    [4, 3, 2, 1]]))  # 16

    print(solution([[1, 2, 3, 4],
                    [5, 6, 7, 10],
                    [4, 3, 2, 1]]))  # 17

    print(solution([[1, 2, 3, 4],
                    [5, 6, 7, 10],
                    [5, 6, 7, 10],
                    [4, 3, 2, 1]]))  # 25
