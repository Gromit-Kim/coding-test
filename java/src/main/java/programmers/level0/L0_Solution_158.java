package programmers.level0;

import java.util.HashSet;
import java.util.Set;

public class L0_Solution_158 {
    // 소인수분해: https://school.programmers.co.kr/learn/courses/30/lessons/120852
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();

        int tmp = n;
        for (int i = 2; i <= n; i++) {
            while (tmp % i == 0) {
                tmp /= i;
                set.add(i);
            }
        }

        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
