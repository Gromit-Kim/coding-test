package programmers.level0;

import java.util.Arrays;

public class L0_Solution_31 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181892
    public int[] solution(int[] num_list, int n) {
        // Arrays.copyOfRange(num_list, n-1, num_list.length);
        return Arrays.stream(num_list).skip(n - 1).toArray();
    }
}
