package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class L1_Solution_82 {
    // 완주하지 못한 선수: https://school.programmers.co.kr/learn/courses/30/lessons/42576
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    map.remove(c);
                } else {
                    map.put(c, map.get(c) - 1);
                }
            }
        }
        for (String key : map.keySet()) {
            return key;
        }
        return "";
    }
}
