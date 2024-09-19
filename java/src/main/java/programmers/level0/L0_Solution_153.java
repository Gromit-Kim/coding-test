package programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class L0_Solution_153 {
    // 문자열 묶기: https://school.programmers.co.kr/learn/courses/30/lessons/181855
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (String str : strArr) {
            map.put(str.length(), map.getOrDefault(str.length(), 0) + 1);
        }
        int max = 0;
        for (int value : map.values()) {
            max = Math.max(value, max);
        }
        return max;
    }
}
