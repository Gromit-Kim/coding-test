package programmers;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class L2_Solution_18 {

    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> frequency = new HashMap<>(); // 귤이 나온 빈도
        for (int t : tangerine) {
            frequency.put(t, frequency.getOrDefault(t, 0) + 1);
        }

        // 빈도 수 기준으로 내림차순 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.addAll(frequency.values());

        int cnt = 0;
        while (k > 0) {
            k -= pq.poll();
            cnt++;
        }
        return cnt;
    }

}
