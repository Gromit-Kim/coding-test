package programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class L0_Solution_193 {
    // 겹치는 선분의 길이: https://school.programmers.co.kr/learn/courses/30/lessons/120876
    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        return (int) map.values().stream().filter(i -> i > 1).count();
    }
}
