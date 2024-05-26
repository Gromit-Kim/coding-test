package programmers;

import java.util.HashSet;
import java.util.Set;

public class L2_Solution_17 {
    public int solution(int[] elements) {
        Set<Integer> s = new HashSet<>();

        for (int len = 1; len <= elements.length; len++) {
            for (int st = 0; st < elements.length; st++) {
                int total = 0;
                for (int i = 0; i < len; i++) {
                    total += elements[(st + i) % elements.length];
                }
                s.add(total);
            }
        }
        return s.size();
    }


}
