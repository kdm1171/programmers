# https://programmers.co.kr/learn/courses/30/lessons/17681
# - 출력 예시랑, 실제 기대값이랑 다름. 출력예시에는 공백이 하나로 표시되어있지만, 실제 테스트케이스 기대값은 공백이 여러개 있음
import unittest

import re

class MyTestCase(unittest.TestCase):
    def setUp(self):
        pass

    def test_1(self):
        r = solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28])
        e = ["#####", "# # #", "### #", "#  ##", "#####"]
        self.assertEqual(e, r)

    def test_2(self):
        r = solution(6, [46, 33, 33, 22, 31, 50], [27, 56, 19, 14, 14, 10])
        e = ["######", "###  #", "##  ##", " #### ", " #####", "### # "]
        self.assertEqual(e, r)


def trans(n, s):
    b = format(s, 'b')
    pad = n - len(b)
    r = ('0' * pad) + b
    r = re.sub('1', '#', r)
    r = re.sub('0', ' ', r)
    return r

def solution(n, arr1, arr2):
    mergedMap = []
    for i in range(n):
        merged = arr1[i] | arr2[i]
        mergedMap.append(merged)
    result = list(map(lambda x: trans(n, x), mergedMap))
    return result


if __name__ == '__main__':
    # print(solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]))
    # print(solution(6, [46, 33, 33, 22, 31, 50], [27, 56, 19, 14, 14, 10]))
    unittest.main()
