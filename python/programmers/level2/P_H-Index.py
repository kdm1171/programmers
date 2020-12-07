# https://programmers.co.kr/learn/courses/30/lessons/42747

def countOfCitation(citations, target):
    count = 0
    for i in citations:
        if target <= i:
            count += 1
    return count


def solution(citations):
    citations.sort()
    h = []
    for i in range(0, len(citations) + 1):
        h.append(min(i, countOfCitation(citations, i)))
    return max(h)


if __name__ == '__main__':
    print(solution([3, 0, 6, 1, 5]))
