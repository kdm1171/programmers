# https://programmers.co.kr/learn/courses/30/lessons/42885

def solution(people, limit):
    answer = 0
    people.sort()
    index = len(people) - 1
    for i in range(len(people)):
        m = people[i]
        if m == 0:
            continue
        for j in range(index, 0, -1):
            weight = people[j]
            if weight == 0:
                continue
            if m + weight > limit:
                people[j] = 0
                answer += 1
            else:
                index = j
                answer += 1
                people[i] = 0
                people[j] = 0
                break

    for i in people:
        if i != 0:
            answer += 1

    return answer


if __name__ == '__main__':
    print(solution([70, 50, 80, 50], 100))
