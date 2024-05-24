package programmers;

import java.util.HashSet;
import java.util.Set;

public class L2_Solution_16 {
    private static Set<String> s = new HashSet<>();

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        char end = words[0].charAt(0);
        for (int i = 0; i < words.length; i++) {
            String cur = words[i];
            if (cur.length() == 1 || cur.charAt(0) != end || s.contains(cur)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
            }
            s.add(cur);
            end = cur.charAt(cur.length() - 1);
        }
        return answer;
    }
}
