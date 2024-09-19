package programmers.level0;

import java.util.Arrays;

public class L0_Solution_154 {
    // 2의 영역: https://school.programmers.co.kr/learn/courses/30/lessons/181894
    public int[] solution(int[] arr) {
        int firstIdx = -1;
        int lastIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstIdx == -1) {
                    firstIdx = i;
                }
                lastIdx = i;
            }
        }
        if (firstIdx == -1) {
            return new int[]{-1};
        }
        return Arrays.copyOfRange(arr, firstIdx, lastIdx + 1);
    }
}
