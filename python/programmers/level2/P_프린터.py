# https://programmers.co.kr/learn/courses/30/lessons/42587

def solution(priorities, location):
    q = []
    for i in range(len(priorities)):
        q.append((i, priorities[i]))
    count = 0
    while len(q) > 0:
        doc = q[0]
        printed = True
        for i in range(1, len(q)):
            if doc[1] < q[i][1]:
                q.remove(doc)
                q.append(doc)
                printed = False

        if printed:
            q.remove(doc)
            count += 1
            if doc[0] == location:
                break

    return count


if __name__ == '__main__':
    print(solution([2, 1, 3, 2], 2))
    print(solution([1, 1, 9, 1, 1, 1], 0))
