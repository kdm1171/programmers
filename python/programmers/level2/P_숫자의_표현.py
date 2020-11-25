# https://programmers.co.kr/learn/courses/30/lessons/12924

def solution(n):
    answer = 0
    startNum = 0
    sumNum = 0
    for _ in range(1, n + 1):
        addNum = startNum
        while sumNum <= n:
            addNum += 1
            sumNum += addNum
            if sumNum == n:
                answer += 1
                break
        startNum += 1
        sumNum = 0
    return answer


if __name__ == '__main__':
    print(solution(15))
