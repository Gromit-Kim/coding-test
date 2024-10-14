package programmers.level1;

import java.util.stream.IntStream;

public class L1_Solution_18 {
    // 나누어 떨어지는 숫자 배열: https://school.programmers.co.kr/learn/courses/30/lessons/12910
    public int[] solution(int[] arr, int divisor) {
        int[] nums = IntStream.range(0, arr.length)
                .filter(i -> arr[i] % divisor == 0)
                .map(i -> arr[i])
                .sorted()
                .toArray();
        if(nums.length == 0)
            return new int[] {-1};
        return nums;
    }
}
