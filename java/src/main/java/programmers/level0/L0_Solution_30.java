package programmers.level0;

import java.util.Arrays;

public class L0_Solution_30 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181888
    public int[] solution(int[] num_list, int n) {
        return Arrays.stream(num_list).limit(n).toArray();
    }
}
