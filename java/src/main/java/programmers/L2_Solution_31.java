package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class L2_Solution_31 {
    private static int answer = 0;

    // 타갯넘버 https://school.programmers.co.kr/learn/courses/30/lessons/43165
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    private void dfs(int[] numbers, int depth, int target, int sum) {
        if (depth == numbers.length) {
            if (target == sum)
                answer++;
            return;
        }
        dfs(numbers, depth + 1, target, sum + numbers[depth]);
        dfs(numbers, depth + 1, target, sum - numbers[depth]);
    }

    private void bfs(int[] numbers, int target) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 0));

        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.level == numbers.length) {
                if (cur.v == target)
                    answer++;
            } else {
                q.offer(new Node(cur.level + 1, cur.v + numbers[cur.level]));
                q.offer(new Node(cur.level + 1, cur.v - numbers[cur.level]));
            }
        }
    }
}

class Node {
    public int level;
    public int v;

    public Node(int level, int v) {
        this.level = level;
        this.v = v;
    }
}
