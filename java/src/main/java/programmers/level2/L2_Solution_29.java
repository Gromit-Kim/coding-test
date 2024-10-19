package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class L2_Solution_29 {
    // [1차] 뉴스 클러스터링:  https://school.programmers.co.kr/learn/courses/30/lessons/17677
    public int solution(String str1, String str2) {
        Map<String, Integer> m1 = div(str1);
        Map<String, Integer> m2 = div(str2);

        int inter = 0, union = 0;
        for (String key : m1.keySet()) {
            if (m2.containsKey(key)) {
                inter += Math.min(m1.get(key), m2.get(key));
                union += Math.max(m1.get(key), m2.get(key));
            } else {
                union += m1.get(key);
            }
        }

        for (String key : m2.keySet()) {
            if (!m1.containsKey(key)) {
                union += m2.get(key);
            }
        }

        if (union == 0) {
            return 65536;
        }
        double j = (double) inter / union;
        return (int) (j * 65536);
    }

    private Map<String, Integer> div(String s) {
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length() - 1; i++) {
            String sub = s.substring(i, i + 2).toLowerCase();
            if (Character.isLetter(sub.charAt(0)) && Character.isLetter(sub.charAt(1))) {
                m.put(sub, m.getOrDefault(sub, 0) + 1);
            }
        }
        return m;
    }
}
