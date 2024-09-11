package programmers.level0;

import java.util.Arrays;

public class L0_Solution_65 {
    // 뒤에서 5등까지:https://school.programmers.co.kr/learn/courses/30/lessons/181853?language=java
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5);
    }
}
