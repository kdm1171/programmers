# https://programmers.co.kr/learn/courses/30/lessons/17683
CODE_LIST = ["C", "C#", "D", "D#", 'E', "F", "F#", "G", "G#", "A", "A#", "B", "E#"]
CODE_TRANS_DICT = {"C": "A",
                   "C#": "B",
                   "D": "C",
                   "D#": "D",
                   'E': "E",
                   "F": "F",
                   "F#": "G",
                   "G": "H",
                   "G#": "I",
                   "A": "J",
                   "A#": "K",
                   "B": "L",
                   "E#": "M"}


def getPlayedCode(playtime, codelist):
    playedCodeList = []
    for i in range(playtime):
        playedCodeList.append(codelist[i % len(codelist)])
    return ''.join([CODE_TRANS_DICT[i] for i in playedCodeList])


def splitCode(code):
    codelist = []
    i = 0
    while len(code) > i:
        currentCode = code[i]
        if len(code) == i + 1:
            codelist.append(currentCode)
            i += 1
            break

        nextCode = code[i + 1]
        if nextCode == '#':
            i += 2
            codelist.append(currentCode + nextCode)
        else:
            codelist.append(currentCode)
            i += 1
    return codelist


def calcPlayTime(s, e):
    startHour, startMin = map(int, s.split(':'))
    endHour, endMin = map(int, e.split(':'))
    hour = endHour - startHour
    minute = endMin - startMin
    playtime = hour * 60 + minute
    return playtime


def solution(m, musicinfos):
    answer = '(None)'
    playbook = []
    for musicinfo in musicinfos:
        info = musicinfo.split(',')
        playtime = calcPlayTime(info[0], info[1])
        name = info[2]
        code = info[3]

        c = splitCode(code)
        playedCode = getPlayedCode(playtime, c)
        playbook.append((name, playedCode, playtime))

    transcode = ''.join([CODE_TRANS_DICT[i] for i in splitCode(m)])
    candidates = []
    for i in playbook:
        if transcode in i[1]:
            candidates.append(i)

    if len(candidates) == 0:
        return answer

    maxPlaytime = candidates[0][2]
    for i in range(1, len(candidates)):
        if maxPlaytime <= candidates[i][2]:
            maxPlaytime = candidates[i][2]

    candidates2 = []
    for i in candidates:
        if i[2] == maxPlaytime:
            candidates2.append(i)
    answer = candidates2[0][0]
    return answer


if __name__ == '__main__':
    print(solution("ABCDEFG", ["12:00,12:14,HELLO,CDEFGAB",
                               "13:00,13:05,WORLD,ABCDEF"]))
    print(solution("CC#BCC#BCC#BCC#B", ["03:00,03:30,FOO,CC#B",
                                        "04:00,04:08,BAR,CC#BCC#BCC#B"]))
    print(solution("ABC", ["12:00,12:14,HELLO,C#DEFGAB",
                           "13:00,13:05,WORLD,ABCDEF"]))

    print(solution("ABC", ["12:00,12:14,HELLO,C#DEFGAB",
                           "12:00,12:17,HELLO2,C#DEFGAB",
                           "12:00,12:17,HELLO3,C#DEFGAB",
                           "13:00,13:05,WORLD,ABCDEF",
                           "13:00,13:12,WORLD2,ABCDEF",
                           "13:00,13:12,WORLD3,ABCDEF"]))
