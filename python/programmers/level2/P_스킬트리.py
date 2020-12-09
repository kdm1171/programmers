# https://programmers.co.kr/learn/courses/30/lessons/49993

def solution(skill, skill_trees):
    answer = 0
    for skill_tree in skill_trees:
        skill_comp = [i for i in skill]
        isMatched = False
        for s in skill_tree:
            if s in skill_comp:
                e = skill_comp.pop(0)
                if e != s:
                    isMatched = False
                    break
            isMatched = True
        if isMatched:
            answer += 1
    return answer


if __name__ == '__main__':
    print(solution("CBD", ["BACDE", "CBADF", "AECB", "BDA"]))
