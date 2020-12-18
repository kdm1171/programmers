# https://programmers.co.kr/learn/courses/30/lessons/68936

def slice2dArray(arr, x1, y1, x2, y2):
    return [[j for j in i[x1:x2]] for i in arr[y1:y2]]


def calcCountZeroAndOne(arr):
    countZero = 0
    countOne = 0

    count = 0
    for i in arr:
        count += sum(i)

    countAll = 0
    for i in arr:
        countAll += len(i)

    if count == 0:
        countZero += 1
    elif count == countAll:
        countOne += 1
    return countZero, countOne


def recursive(arr):
    if len(arr) == 1:
        if arr[0][0] == 0:
            return 1, 0
        else:
            return 0, 1

    zero, one = calcCountZeroAndOne(arr)
    zero1, zero2, zero3, zero4 = 0, 0, 0, 0
    one1, one2, one3, one4 = 0, 0, 0, 0
    if zero == one == 0:
        size = len(arr)
        zero1, one1 = recursive(slice2dArray(arr, 0, 0, size // 2, size // 2))
        zero2, one2 = recursive(slice2dArray(arr, 0, size // 2, size // 2, size))
        zero3, one3 = recursive(slice2dArray(arr, size // 2, 0, size, size // 2))
        zero4, one4 = recursive(slice2dArray(arr, size // 2, size // 2, size, size))

    return sum([zero, zero1, zero2, zero3, zero4]), sum([one, one1, one2, one3, one4])


def solution(arr):
    zero, one = recursive(arr)
    return [zero, one]


if __name__ == '__main__':
    print(solution([[1, 1, 0, 0],
                    [1, 0, 0, 0],
                    [1, 0, 0, 1],
                    [1, 1, 1, 1]]))

    print(solution([[1, 1, 1, 1, 1, 1, 1, 1],
                    [0, 1, 1, 1, 1, 1, 1, 1],
                    [0, 0, 0, 0, 1, 1, 1, 1],
                    [0, 1, 0, 0, 1, 1, 1, 1],
                    [0, 0, 0, 0, 0, 0, 1, 1],
                    [0, 0, 0, 0, 0, 0, 0, 1],
                    [0, 0, 0, 0, 1, 0, 0, 1],
                    [0, 0, 0, 0, 1, 1, 1, 1]]))
