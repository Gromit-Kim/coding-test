package programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class L2_Solution_18 {
    // 연속 부분 수열 합의 개수: https://school.programmers.co.kr/learn/courses/30/lessons/131701
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int[] sum = new int[elements.length];
        for (int start = 0; start < elements.length; start++) {
            for (int end = start; end < start + elements.length; end++) {
                sum[start] += elements[end % elements.length];
                set.add(sum[start]);
            }
        }
        return set.size();
    }
}
