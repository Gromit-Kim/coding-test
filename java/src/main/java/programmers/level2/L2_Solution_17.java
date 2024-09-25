package programmers.level2;

import java.util.*;

public class L2_Solution_17 {
    // 귤 고르기: https://school.programmers.co.kr/learn/courses/30/lessons/138476
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>(); // 귤 크기, 개수
        for (int tan : tangerine) {
            map.put(tan, map.getOrDefault(tan, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(map.values());
        counts.sort(Comparator.reverseOrder());

        int answer = 0;
        for (int count : counts) {
            k -= count;
            answer++;
            if (k <= 0) {
                break;
            }
        }
        return answer;
    }
}
