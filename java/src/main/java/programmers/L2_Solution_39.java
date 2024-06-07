package programmers;

import java.util.PriorityQueue;

public class L2_Solution_39 {
    // 더 맵게
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.add(s);
        }

        int answer = 0;
        while (true) {
            if (pq.peek() >= K)
                break;
            if (pq.peek() < K && pq.size() == 1) {
                answer = -1;
                break;
            }
            pq.add(pq.poll() + (pq.poll() * 2));
            answer++;
        }
        return answer;
    }
}
