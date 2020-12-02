# https://programmers.co.kr/learn/courses/30/lessons/42583

# 5번 케이스 시간초과
# def solution(bridge_length, weight, truck_weights):
#     time = 0
#     truck_moves = [0] * bridge_length
#     print(bridge_length, weight, truck_weights)
#     while True:
#         time += 1
#         newTruck = 0
#         if len(truck_weights) > 0:
#             newTruck = truck_weights[0]
#         if sum(truck_moves) + newTruck <= weight:
#             truck_moves[(time - 1) % bridge_length] = newTruck
#             if len(truck_weights) > 0:
#                 truck_weights.remove(newTruck)
#         truck_moves[time % bridge_length] = 0
#
#         if sum(truck_moves) == 0 and len(truck_weights) == 0:
#             break
#     return time + 1

# truck_moves와 truck_weights의 총합을 매번 계산하여 오버헤드 발생됨. 루프마다 +- 연산으로 처리하여 속도 개선
def solution(bridge_length, weight, truck_weights):
    time = 0
    truck_moves = [0] * bridge_length
    weights = sum(truck_weights)
    moves = 0
    while True:
        newTruck = 0
        moves -= truck_moves.pop()
        if len(truck_weights) > 0:
            newTruck = truck_weights[0]
        if moves + newTruck <= weight:
            moves += newTruck
            weights -= newTruck
            truck_moves.insert(0, newTruck)
            if len(truck_weights) > 0:
                truck_weights.remove(newTruck)
        else:
            truck_moves.insert(0, 0)

        time += 1
        if moves == 0 and weights == 0:
            break

    return time


if __name__ == '__main__':
    print(solution(2, 10, [7, 4, 5, 6]))
    print(solution(100, 100, [10]))
    print(solution(100, 100, [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]))
