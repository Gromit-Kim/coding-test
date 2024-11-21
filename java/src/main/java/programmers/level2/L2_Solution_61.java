package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class L2_Solution_61 {
    // 프로그래머스 L2 - 시소 짝궁, 4p
    public long solution(int[] weights) {
        long answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int w : weights) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int w1 = e.getKey(), cnt1 = e.getValue();
            if (cnt1 > 1) {
                answer += (long) cnt1 * (cnt1 - 1) / 2;
            }

            for (Map.Entry<Integer, Integer> e2 : map.entrySet()) {
                int w2 = e2.getKey(), cnt2 = e2.getValue();

                if (w1 >= w2) {
                    continue;
                }

                if (w1 * 2 == w2 || w1 * 3 == w2 * 2 || w1 * 4 == w2 * 3) {
                    answer += (long) cnt1 * cnt2;
                }
            }

        }

        return answer;
    }
}
