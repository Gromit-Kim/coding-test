import sys
input = sys.stdin.readline
INF = int(1e9)

n, m = map(int, input().split())
start = int(input())
graph = [[] for _ in range(n+1)] # 각 노드에 연결되어 있는 노드에 대한 정보를 담는 리스트
visited = [False] * (n+1)
distance = [INF] * (n+1)

# 모든 간선 정보 입력받기
for _ in range(m):
    v1, v2, c = map(int, input().split())
    graph[v1].append((v2, c)) # v1 to v2의 cost가 c

# 방문하지 않은 노드 중 가장 최단 거리가 짧은 노드의 번호를 반환
def get_smallest_node():
    min_value = INF
    index = 0 # 가장 최단 거리가 짧은 노드(인덱스)
    for i in range(1, n+1):
        if distance[i] < min_value and not visited[i]:
            min_value = distance[i]
            index = i
    return index

def dijkstra(start):
    distance[start] = 0
    visited[start] = True
    for neighbor_node, cost in graph[start]: # j 는 start node와 연결된 node 정보 (node, cost)
        distance[neighbor_node] = cost
    for _ in range(n-1):# 마지막 노드는 볼 필요가 없다.
        now = get_smallest_node()
        visited[now] = True
        for neighbor_node, cost in graph[now]:
            new_cost = cost + distance[now]
            if new_cost < distance[neighbor_node]:
                distance[neighbor_node] = new_cost

dijkstra(start)

for i in range(1, n+1):
    if distance[i] == INF:
        print("INFINITY")
    else:
        print(distance[i])
    