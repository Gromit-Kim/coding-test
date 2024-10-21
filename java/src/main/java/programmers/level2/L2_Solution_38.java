package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class L2_Solution_38 {
    // 롤케이크 자르기: https://school.programmers.co.kr/learn/courses/30/lessons/132265
    private static Map<Integer, Integer> left = new HashMap<>();
    private static Map<Integer, Integer> right = new HashMap<>();

    public int solution(int[] topping) {
        for (int t : topping) {
            right.put(t, right.getOrDefault(t, 0) + 1);
        }

        int answer = 0;
        for (int i = 0; i < topping.length - 1; i++) {
            int t = topping[i];

            left.put(t, left.getOrDefault(t, 0) + 1);
            if (right.get(t) == 1) {
                right.remove(t);
            } else {
                right.put(t, right.get(t) - 1);
            }

            if (left.size() == right.size()) {
                answer++;
            }
        }

        return answer;
    }
}
