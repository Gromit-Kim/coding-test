package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class L1_Solution_52 {
    private static Map<Character, Integer> map = new HashMap<>();

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            answer[i] = i - map.getOrDefault(ch, i + 1);
            map.put(ch, i);
        }
        return answer;
    }
}
