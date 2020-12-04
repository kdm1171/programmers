# https://programmers.co.kr/learn/courses/30/lessons/42883

def solution(number, k):
    answer = []
    index = -1
    for i in range(len(number) - k):
        m = '0'
        for j in range(index + 1, k + i + 1):
            n = number[j]
            # 테스트케이스 10번 계속 시간초과 하다가 9인경우 break 거니까 바로 통과
            # 냉정하게 실전에서 이런문제 나오면 맞출수 있을지 모르겠음
            # 입력을 전부 예상해서 시간초과 될 경우 이런 꼼수를 써야 하는건데 시간제한 내에 방법이 떠오를지 모르겠음.
            if m == '9':
                break
            if m < n:
                index = j
                m = n
        answer.append(m)
    return ''.join(answer)


if __name__ == '__main__':
    print(solution("1924", 2))
    print(solution("1231234", 3))
    print(solution("4177252841", 4))
    print(solution("1924", 3))
    print(solution("321", 1))
    print(solution("123987654321", 9))
    print(solution("99999999999999999999999999999911", 30))
