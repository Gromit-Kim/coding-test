package programmers.level2;

import java.util.Arrays;

public class L2_Solution_1 {
    // 최댓값과 최솟값: https://school.programmers.co.kr/learn/courses/30/lessons/12939
    public String solution(String s) {
        int[] nums = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return min + " " + max;
    }
}
