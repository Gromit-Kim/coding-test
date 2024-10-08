package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class L1_Solution_81 {
    // 대충 만든 자판: https://school.programmers.co.kr/learn/courses/30/lessons/160586
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                map.put(ch, Math.min(i + 1, map.getOrDefault(ch, Integer.MAX_VALUE)));
            }
        }

        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int total = 0;
            boolean isValid = true;
            for (char ch : target.toCharArray()) {
                if (map.containsKey(ch)) {
                    total += map.get(ch);
                } else {
                    isValid = false;
                    break;
                }
            }
            answer[i] = isValid ? total : -1;
        }
        return answer;
    }
}
