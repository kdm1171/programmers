# https://programmers.co.kr/learn/courses/30/lessons/12973

def solution(s):
    answer = []

    for i in range(0, len(s)):
        current = s[i]
        if len(answer) == 0:
            answer.append(current)
            continue
        last = answer.pop()

        if last != current:
            answer.append(last)
            answer.append(current)

    return 1 if len(answer) == 0 else 0


if __name__ == '__main__':
    print(solution("baabaa"))
    print(solution("cdcd"))
