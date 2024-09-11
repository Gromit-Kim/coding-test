package programmers.level0;

import java.util.Arrays;

public class L0_Solution_71 {
    // 배열 비교하기: https://school.programmers.co.kr/learn/courses/30/lessons/181856?language=java
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length)
            return 1;
        if(arr1.length < arr2.length)
            return -1;
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        return Integer.compare(sum1, sum2);
    }
}
