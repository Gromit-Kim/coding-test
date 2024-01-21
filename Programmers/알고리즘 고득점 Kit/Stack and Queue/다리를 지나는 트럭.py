def solution(bridge_length, weight, truck_weights):
    answer = 0
    in_bridge = []
    total_weight_on_bridge = 0
    while in_bridge or truck_weights:
        answer += 1
        in_bridge = [(weight, distance + 1) for weight, distance in in_bridge]
        if in_bridge and in_bridge[0][1] == bridge_length:
            total_weight_on_bridge -= in_bridge.pop(0)[0]
        if truck_weights and total_weight_on_bridge + truck_weights[0] <= weight:
            truck = truck_weights.pop(0)
            total_weight_on_bridge += truck
            in_bridge.append((truck, 0))
    return answer