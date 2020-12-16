# https://programmers.co.kr/learn/courses/30/lessons/42888
import re


def solution(record):
    answer = []
    pattern = re.compile(r"^(Enter|Leave|Change) (?P<userId>\w*) ?(?P<name>\w*)?")
    nicknames = dict()
    for i in record:
        m = pattern.match(i)
        if m.group(1) in ['Enter', 'Change']:
            nicknames[m.group('userId')] = m.group('name')

    for i in record:
        m = pattern.match(i)
        op = m.group(1)
        if op == 'Enter':
            answer.append(f"{nicknames[m.group('userId')]}님이 들어왔습니다.")
        elif op == 'Leave':
            answer.append(f"{nicknames[m.group('userId')]}님이 나갔습니다.")
    return answer


if __name__ == '__main__':
    print(solution(
        ["Enter uid1234 Muzi",
         "Enter uid4567 Prodo",
         "Leave uid1234",
         "Enter uid1234 Prodo",
         "Change uid4567 Ryan"]))
