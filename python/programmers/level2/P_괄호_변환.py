# https://programmers.co.kr/learn/courses/30/lessons/60058

def checkOk(p):
    count = 0
    for i in p:
        if i == '(':
            count += 1
        else:
            count -= 1
        if count < 0:
            return False
    return True


def reverse(p):
    reversed = []
    for i in p:
        if i == '(':
            reversed.append(')')
        else:
            reversed.append('(')
    return ''.join(reversed)


def solution(p):
    if checkOk(p):
        return p

    count = 0
    index = 0
    for i, v in enumerate(p):
        index += 1
        if v == '(':
            count += 1
        else:
            count -= 1
        if count == 0:
            break
    u = p[:index]
    v = p[index:]

    if checkOk(u):
        return u + solution(v)
    else:
        s = '(' + solution(v) + ')'
        return s + reverse(u[1:len(u) - 1])


if __name__ == '__main__':
    print(solution("(()())()"))
    print(solution(")("))
    print(solution("()))((()"))
