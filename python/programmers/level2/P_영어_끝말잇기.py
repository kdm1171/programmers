# https://programmers.co.kr/learn/courses/30/lessons/12981

def solution(n, words):
    answer = [0, 0]

    player = [i + 1 for i in range(n)]
    speaks = {}
    for i in words:
        speaks[i] = False

    last = words[0]
    speaks[last] = True
    for i in range(1, len(words)):
        word = words[i]
        if last[-1:] != word[:1]:
            return [player[i % n], (i // n) + 1]
        if speaks[word]:
            return [player[i % n], (i // n) + 1]
        speaks[word] = True
        last = word
    return answer


if __name__ == '__main__':
    print(solution(3, ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]))
    print(solution(5, ["hello", "observe", "effect", "take", "either", "recognize",
                       "encourage", "ensure", "establish", "hang", "gather", "refer",
                       "reference", "estimate", "executive"]))
    print(solution(2, ["hello", "one", "even", "never", "now", "world", "draw"]))
