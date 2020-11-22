# https://programmers.co.kr/learn/courses/30/lessons/42889

import unittest


class MyTestCase(unittest.TestCase):
    def setUp(self):
        pass

    def test_1(self):
        r = solution(5, [2, 1, 2, 6, 2, 4, 3, 3])
        e = [3, 4, 2, 1, 5]
        self.assertEqual(e, r)

    def test_2(self):
        r = solution(4, [4, 4, 4, 4, 4])
        e = [4, 1, 2, 3]
        self.assertEqual(e, r)


def solution(N, stages):
    listPassed = [0] * (N + 1)
    listTry = [0] * (N + 1)
    for stageNumber in range(N):
        for i in stages:
            if i > stageNumber:
                listPassed[stageNumber] += 1

    for i in stages:
        listTry[i - 1] += 1

    new_dict = {i: 0 if listPassed[i] == 0 else listTry[i] / listPassed[i] for i in range(N)}
    s = sorted(new_dict.items(), key=lambda x: x[1], reverse=True)
    answer = []
    for i in s:
        answer.append(i[0] + 1);
    return answer


if __name__ == '__main__':
    unittest.main()
