# https://programmers.co.kr/learn/courses/30/lessons/42586

def solution(progresses, speeds):
    answer = []
    count = 0
    while len(progresses) > 0:
        count += 1
        deployed = 0
        for i in range(len(progresses)):
            progresses[i] += speeds[i]

        for _ in range(len(progresses)):
            e = progresses.pop(0)
            if e >= 100:
                deployed += 1
                speeds.pop(0)
            else:
                progresses.insert(0, e)
                break
        if deployed > 0:
            answer.append(deployed)
    return answer


if __name__ == '__main__':
    print(solution([93, 30, 55], [1, 30, 5]))
    print(solution([95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1]))
    print(solution([99, 99, 99, 99, 99], [3, 3, 3, 3, 3]))
    print(solution([93], [1]))
    print(solution([5, 5, 5], [21, 25, 20]))
    print(solution([99, 1], [1, 99]))
    print(solution([98, 99, 97, 96], [1, 1, 1, 1]))
    print(solution([96, 99, 98, 97], [1, 1, 1, 1]))
    print(solution([95, 95, 95, 95], [4, 3, 2, 1]))
