# https://programmers.co.kr/learn/courses/30/lessons/12945

def solution(n):
    l = [0, 1]
    for i in range(2, n):
        l[i % 2] = l[(i - 1) % 2] + l[(i - 2) % 2]
    return (l.pop() + l.pop()) % 1234567

if __name__ == '__main__':
    print(solution(3))
    print(solution(5))