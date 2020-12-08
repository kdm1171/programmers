# https://programmers.co.kr/learn/courses/30/lessons/42842

# 가로가 세로보다 길다.
# 1번 케이스
# 10 -> 14, 2  # 전체 면적 = 10 + 2 = 12
# 8, 6 -> 4, 3 -> # 전체 면적 = 4*3 = 12 * 정답
# 10, 4 -> 5, 2 -> # 전체 면적 = 5*2 = 10

# 2번 케이스
# 8 -> 12, 1  # 전체 면적 = 8 + 1
# 6, 6 -> 3, 3 -> # 전체 면적 = 3 * 3 = 9 * 정답

# 3번 케이스
# 24 -> 28, 24 # 전체면적 = 24+24 = 48
# 22, 6 -> 11, 3 # 11*3 = 33
# 20, 8 -> 10, 4 # 10*4 = 40
# 18, 10 -> 9, 5 # 9*5 = 45
# 16, 12 -> 8, 6 # 6*8 = 48 * 정답
# 14, 14 -> 7, 7 # 7*7 = 49

# 가로가 세로보다 길다.
def findCandidates(brown):
    cantidates = []
    b = brown + 4
    height = 6
    width = b - height
    while width >= height:
        cantidates.append((int(width / 2), int(height / 2)))
        height += 2
        width -= 2
    return cantidates


def solution(brown, yellow):
    answer = []
    candidates = findCandidates(brown)
    for width, height in candidates:
        total = width * height
        if brown + yellow == total:
            return [width, height]
    return answer


if __name__ == '__main__':
    print(solution(10, 2))
    print(solution(8, 1))
    print(solution(24, 24))
