# https://programmers.co.kr/learn/courses/30/lessons/42577


def solution(phone_book):
    l = sorted(phone_book, key=lambda x: len(str(x)))

    for i, a in enumerate(l):
        for j, b in enumerate(l):
            if i == j:
                continue
            if str(b).startswith(str(a)):
                return False
    return True


if __name__ == '__main__':
    print(solution([119, 97674223, 1195524421]))
    print(solution([123, 456, 789]))
    print(solution([12, 123, 1235, 567, 88]))
