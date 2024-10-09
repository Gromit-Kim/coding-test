package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class L1_Solution_78 {
    // 로또의 최고 순위와 최저 순위: https://school.programmers.co.kr/learn/courses/30/lessons/77484
    private static Map<Integer, Integer> result = new HashMap<>();

    static {
        result.put(6, 1);
        result.put(5, 2);
        result.put(4, 3);
        result.put(3, 4);
        result.put(2, 5);
        result.put(1, 6);
        result.put(0, 6);
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int lotto : lottos) {
            map.put(lotto, map.getOrDefault(lotto, 0) + 1);
        }
        int cnt = 0;
        for (int win : win_nums) {
            if (map.containsKey(win)) {
                cnt++;
            }
        }

        return new int[]{result.get(cnt + map.getOrDefault(0, 0)), result.get(cnt)};
    }
}
