package programmers.level1;

import java.util.Arrays;

public class L1_Solution_2 {
    public double solution(int[] arr) {
        return Arrays.stream(arr)
                .average()
                .orElse(0);
    }
}
