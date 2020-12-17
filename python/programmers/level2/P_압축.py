# https://programmers.co.kr/learn/courses/30/lessons/17684

def initDict():
    dictionary = {}
    for i in range(26):
        dictionary[chr((i + 65))] = i + 1
    return dictionary


def maxKeyLen(dictionary):
    keyLen = 0
    for i in dictionary:
        keyLen = max(keyLen, len(i))
    return keyLen


def solution(msg):
    answer = []

    dictionary = initDict()

    i = 0
    while len(msg) > i:
        keyLen = maxKeyLen(dictionary)
        while True:
            w = msg[i:i + keyLen]
            num = dictionary.get(w)
            if num is None:
                keyLen -= 1
                continue
            else:
                answer.append(num)
                c = msg[i + keyLen:i + keyLen + 1]
                dictionary[w + c] = len(dictionary) + 1
                i += keyLen
                break
    return answer


if __name__ == '__main__':
    print(solution("KAKAO"))
    print(solution("TOBEORNOTTOBEORTOBEORNOT"))
    print(solution("ABABABABABABABAB"))
