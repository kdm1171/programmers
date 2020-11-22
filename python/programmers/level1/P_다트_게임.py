import unittest
import re


class MyTestCase(unittest.TestCase):
    def setUp(self):
        pass

    def test_1(self):
        p = "1S2D*3T"
        e = 37
        r = solution(p)
        self.assertEqual(e, r)

    def test_2(self):
        p = "1D2S#10S"
        e = 9
        r = solution(p)
        self.assertEqual(e, r)

    def test_3(self):
        p = "1D2S0T"
        e = 3
        r = solution(p)
        self.assertEqual(e, r)

    def test_4(self):
        p = "1S*2T*3S"
        e = 23
        r = solution(p)
        self.assertEqual(e, r)

    def test_5(self):
        p = "1D#2S*3S"
        e = 5
        r = solution(p)
        self.assertEqual(e, r)

    def test_6(self):
        p = "1T2D3D#"
        e = -4
        r = solution(p)
        self.assertEqual(e, r)

    def test_7(self):
        p = "1D2S3T*"
        e = 59
        r = solution(p)
        self.assertEqual(e, r)


def getDartPow(n):
    return {'S': 1, 'D': 2, 'T': 3}[n]


def calcScore(a, b):
    return int(a) ** getDartPow(b)


def solution(dartResult):
    pattern = r"(?P<first>\d{1,2})" \
              r"(?P<firstDart>\w)" \
              r"(?P<firstStar>[#,*]{0,1})" \
              r"(?P<second>\d{1,2})" \
              r"(?P<secondDart>\w)" \
              r"(?P<secondStar>[#,*]{0,1})" \
              r"(?P<third>\d{1,2})" \
              r"(?P<thirdDart>\w)" \
              r"(?P<thirdStar>[#,*]{0,1})"

    matchObj = re.match(pattern, dartResult)

    first = matchObj.group('first')
    firstDart = matchObj.group('firstDart')
    firstStar = matchObj.group('firstStar')
    second = matchObj.group('second')
    secondDart = matchObj.group('secondDart')
    secondStar = matchObj.group('secondStar')
    third = matchObj.group('third')
    thirdDart = matchObj.group('thirdDart')
    thirdStar = matchObj.group('thirdStar')

    firstScore = calcScore(first, firstDart)
    secondScore = calcScore(second, secondDart)
    thirdScore = calcScore(third, thirdDart)

    if firstStar == '#':
        firstScore *= -1
    elif firstStar == '*':
        firstScore *= 2
    if secondStar == '#':
        secondScore *= -1
    elif secondStar == '*':
        secondScore *= 2
        firstScore *= 2
    if thirdStar == '#':
        thirdScore *= -1
    elif thirdStar == '*':
        thirdScore *= 2
        secondScore *= 2

    return firstScore + secondScore + thirdScore


if __name__ == '__main__':
    unittest.main()
