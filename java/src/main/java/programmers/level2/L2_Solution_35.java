package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L2_Solution_35 {
    // [3차] 압축: https://school.programmers.co.kr/learn/courses/30/lessons/17684
    private static Map<String, Integer> map = new HashMap<>();

    static {
        for (int i = 1; i <= 26; i++) {
            map.put(String.valueOf((char) ('A' + i - 1)), i);
        }
    }

    public int[] solution(String msg) {
        List<Integer> lst = new ArrayList<>();
        int last = 27;
        for (int i = 0; i < msg.length(); ) { // 시작 인덱스 잡기
            int len = 1;
            String sub = msg.substring(i, i + len);
            while (i + len <= msg.length() && map.containsKey(sub)) {
                len++;
                if (i + len > msg.length()) {
                    break;
                }
                sub = msg.substring(i, i + len);
            }
            lst.add(map.get(msg.substring(i, i + len - 1)));
            if (i + len <= msg.length()) {
                map.put(sub, last++);
            }
            i += len - 1;
        }
        return lst.stream().mapToInt(i -> i).toArray();
    }
}
