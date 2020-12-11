# https://programmers.co.kr/learn/courses/30/lessons/1845
def solution(nums):
    s = set()
    for i in nums:
        s.add(i)
    return min(len(s), (len(nums) // 2))


if __name__ == '__main__':
    print(solution([3, 1, 2, 3]))
    print(solution([3, 3, 3, 2, 2, 4]))
    print(solution([3, 3, 3, 2, 2, 2]))
