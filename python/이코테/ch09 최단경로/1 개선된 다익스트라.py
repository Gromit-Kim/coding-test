import heapq
import sys
input = sys.stdin.readline
INF = int(1e9)

n, m = map(int, input().split())
start = int(input())
graph = [[] for _ in range(n+1)] # (node, cost)를 담는다.
distance = [INF] * (n+1)

for _ in range(m):
    fr, t, cost = map(int, input().split())
    graph[fr].append((t, cost))

def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q:
        dist, now = heapq.heappop(q)
        if distance[now] < dist: # 현재 노드가 이미 최단거리이면
            continue
        for info in graph[now]:
            cost = dist + info[1]
            if cost < distance[info[0]]:
                distance[info[0]] = cost
                heapq.heappush(q, (cost, info[0]))

dijkstra(start)

for i in range(1, n+1):
    if distance[i] == INF:
        print("INFINITY")
    else:
        print(distance[i])