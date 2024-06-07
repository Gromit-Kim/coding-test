package programmers;

import java.util.HashMap;
import java.util.Map;

public class L2_Solution_36 {
    // [모음 사전] https://school.programmers.co.kr/learn/courses/30/lessons/84512
    private static final char[] VOWELS = {'A', 'E', 'I', 'O', 'U'};
    private static Map<String, Integer> map = new HashMap<>();
    private static int index = 1;

    public int solution(String word) {
        generateWords("");
        return map.get(word);
    }

    private void generateWords(String current) {
        if (current.length() > 5)
            return;
        if (!current.isEmpty())
            map.put(current, index++);
        for (char c : VOWELS) {
            generateWords(current + c);
        }
    }
}
