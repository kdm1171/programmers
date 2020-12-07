# https://programmers.co.kr/learn/courses/30/lessons/42578
from itertools import combinations, product


# def convertClothesStructure(clothes):
#     d = dict()
#     # init
#     for i in clothes:
#         category = i[1]
#         d[category] = []
#     # append
#     for i in clothes:
#         category = i[1]
#         name = i[0]
#         d[category].append(name)
#     prod = list(product(*d.values()))
#     return prod
#
#
# def solution(clothes):
#     relations = convertClothesStructure(clothes)
#     s = set()
#     maxElem = max([len(i) for i in relations])
#     for i in relations:
#         for k in range(1, maxElem + 1):
#             for j in combinations(i, k):
#                 s.add(j)
#         pass
#     return len(s)

# 의상종류 구하기
def getClothesDict(clothes):
    d = dict()
    # init
    for i in clothes:
        category = i[1]
        d[category] = []
        # append
    for i in clothes:
        category = i[1]
        name = i[0]
        d[category].append(name)
    return d


# 모든 조합을 구해서 계산했더니 시간초과 발생
# 구글링 해보니 단순히 수식으로 구현 가능해 보여서 전략 변경...
# (의상종류 별 옷 갯수 +1) 곱 -1
def solution(clothes):
    clothesDict = getClothesDict(clothes)
    answer = 1
    for i in clothesDict.values():
        answer *= len(i) + 1
    return answer - 1


if __name__ == '__main__':
    print(solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]))
    print(solution([["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]))
