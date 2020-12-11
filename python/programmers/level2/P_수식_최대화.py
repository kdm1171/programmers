# https://programmers.co.kr/learn/courses/30/lessons/67257

def calc(operator, n, exp):
    if n == 2:
        return str(eval(exp))
    op = ['*', '+', '-']
    result = 0
    for i in op:
        if operator[n] == i:
            result = eval(i.join(calc(operator, n + 1, e) for e in exp.split(i)))
    return str(result)


def solution(expression):
    answer = []
    priorities = [
        ['*', '+', '-'],
        ['*', '-', '+'],
        ['+', '*', '-'],
        ['+', '-', '*'],
        ['-', '*', '+'],
        ['-', '+', '*']]

    for i in priorities:
        result = int(calc(i, 0, expression))
        answer.append(abs(result))
    return max(answer)


if __name__ == '__main__':
    print(solution("100-200*300-500+20"))
    print(solution("50*6-3*2"))
