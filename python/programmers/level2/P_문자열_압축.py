# https://programmers.co.kr/learn/courses/30/lessons/60057

def solution(s):
    answer = []

    if len(s) == 1:
        return 1

    for i in range(1, int(len(s) / 2) + 1):
        count = 1
        key = s[:i]
        compressed = ""
        for j in range(i, len(s), i):
            comp = s[j:j + i]
            if key == comp:
                count += 1
            else:
                compressed = ''.join([compressed, str(count) if count > 1 else '', key])
                key = comp
                count = 1

        compressed = ''.join([compressed, str(count) if count > 1 else '', key])
        answer.append(len(compressed))

    return min(answer)


if __name__ == '__main__':
    print(solution("aabbaccc"))
    print(solution("ababcdcdababcdcd"))
    print(solution("abcabcdede"))
    print(solution("abcabcabcabcdededededede"))
    print(solution("xababcdcdababcdcd"))
