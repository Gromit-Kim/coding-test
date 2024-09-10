package programmers.level0;

import java.util.Arrays;

public class L0_Solution_44 {
    // 원소들의 곱과 합: https://school.programmers.co.kr/learn/courses/30/lessons/181929
    public int solution(int[] num_list) {
        int sum = Arrays.stream(num_list).sum();
        int mul = Arrays.stream(num_list).reduce(1, (sub, ele) -> sub * ele);
        if (mul > sum * sum)
            return 0;
        return 1;
    }
}
