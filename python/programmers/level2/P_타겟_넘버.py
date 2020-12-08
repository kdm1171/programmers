# https://programmers.co.kr/learn/courses/30/lessons/43165?language=python3
def dfs(numbers, n, m, target):
    if len(numbers) == n:
        if m == target:
            return 1
        return 0
    return dfs(numbers, n + 1, m + numbers[n], target) + dfs(numbers, n + 1, m - numbers[n], target)


def solution(numbers, target):
    return dfs(numbers, 0, 0, target)


if __name__ == '__main__':
    print(solution([1, 1, 1, 1, 1], 3))
