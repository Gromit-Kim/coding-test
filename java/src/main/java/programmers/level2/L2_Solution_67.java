package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class L2_Solution_67 {
    // 배달: https://school.programmers.co.kr/learn/courses/30/lessons/12978
    public int solution(int N, int[][] road, int K) {
        List<List<Node>> graph = initGraph(N, road);

        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dijkstra(1, dist, graph);

        int answer = 0;
        for (int d : dist) {
            if (d <= K) {
                answer++;
            }
        }
        return answer;
    }

    private List<List<Node>> initGraph(int N, int[][] road) {
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] r : road) {
            int a = r[0], b = r[1], c = r[2];
            graph.get(a).add(new Node(b, c));
            graph.get(b).add(new Node(a, c));
        }
        return graph;
    }

    private void dijkstra(int start, int[] dist, List<List<Node>> graph) {
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(1, 0));

        while (!pq.isEmpty()){
            Node cur = pq.poll();

            if(cur.dist > dist[cur.id])
                continue; // 이미 처리된 것

            for(Node next : graph.get(cur.id)){
                int newDist = cur.dist + next.dist;
                if(newDist < dist[next.id]){
                    dist[next.id] = newDist;
                    pq.offer(new Node(next.id, newDist));
                }
            }
        }

    }

    class Node implements Comparable<Node>{
        public int id;
        public int dist;

        public Node(int id, int dist) {
            this.id = id;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node o){
            return Integer.compare(this.dist, o.dist);
        }
    }

}
