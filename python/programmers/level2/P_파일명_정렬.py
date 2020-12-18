# https://programmers.co.kr/learn/courses/30/lessons/17686
import re
import functools

matcher = re.compile(r"^(?P<head>[A-z\.\s-]+)(?P<number>\d+)(?P<tail>.*)")


def customCompare(file1, file2):
    matched1 = matcher.match(file1)
    head1 = matched1.group('head')
    number1 = int(matched1.group('number'))

    matched2 = matcher.match(file2)
    head2 = matched2.group('head')
    number2 = int(matched2.group('number'))

    if head1.upper() > head2.upper():
        return 1
    elif head2.upper() > head1.upper():
        return -1
    else:
        if number1 > number2:
            return 1
        elif number2 > number1:
            return -1
        else:
            return 0


def solution(files):
    sortedList = sorted(files, key=functools.cmp_to_key(customCompare))
    return sortedList


if __name__ == '__main__':
    print(solution(["img12.png", 'img10.png', 'img02.png', 'img1.png', 'IMG01.GIF', 'img2.JPG']))
    print(solution(['F-5 Freedom Fighter', 'B-50 Superfortress', 'A-10 Thunderbolt II', 'F-14 Tomcat']))
    print(solution(['F .-101']))
