def solution(s):
    index = 0
    for c in s:
        if c == '(':
            index += 1
        else:
            index -= 1

        if index < 0:
            return False

    return index == 0


if __name__ == '__main__':
    print(solution('()()'))
    print(solution('(())()'))
    print(solution(')()('))
    print(solution('(()('))
