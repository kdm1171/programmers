import unittest


class MyTestCase(unittest.TestCase):
    def setUp(self):
        pass

    def test_1(self):
        r = solution(2)
        self.assertEqual("Even", r)

    def test_2(self):
        r = solution(1)
        self.assertEqual("Odd", r)


def solution(num):
    return "Even" if num % 2 == 0 else "Odd"


if __name__ == '__main__':
    unittest.main()
