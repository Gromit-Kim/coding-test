package programmers.level2;

import java.util.PriorityQueue;

public class L2_Solution_41 {
    // 더 맵게: https://school.programmers.co.kr/learn/courses/30/lessons/42626
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.add(s);
        }

        int answer = 0;
        while (pq.peek() < K) {
            if (pq.size() == 1 && pq.peek() < K) {
                return -1;
            }
            int first = pq.poll();
            int second = pq.poll();
            pq.add(first + second * 2);
            answer++;
        }
        return answer;
    }
}
