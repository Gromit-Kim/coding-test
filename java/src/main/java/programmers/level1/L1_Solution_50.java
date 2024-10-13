package programmers.level1;

import java.util.Arrays;

public class L1_Solution_50 {
    public int solution(int[][] sizes) {
        int w_max = -1;
        int h_max = -1;
        for (int[] size : sizes) {
            Arrays.sort(size);
            w_max = Math.max(w_max, size[0]);
            h_max = Math.max(h_max, size[1]);
        }
        return w_max * h_max;
    }
}
