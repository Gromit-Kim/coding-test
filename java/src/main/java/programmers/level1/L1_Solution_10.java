package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L1_Solution_10 {
    // 정수 내림차순으로 배치하기: https://school.programmers.co.kr/learn/courses/30/lessons/12933
    public long solution(long n) {
        String a = n + "";
        int[] nums = new int[a.length()];

        int i = 0;
        while(n > 0){
            nums[i++] = (int) (n % 10);
            n/=10;
        }

        Arrays.sort(nums);
        long answer = 0;
        for(int j = 1; j <= nums.length; j++){
            answer += (long) (nums[nums.length - j] * Math.pow(10, nums.length - j));
        }
        return answer;
    }
}
