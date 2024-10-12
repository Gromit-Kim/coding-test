package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class L1_Solution_65 {
    // 포켓몬: https://school.programmers.co.kr/learn/courses/30/lessons/1845
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        return Math.min(set.size(), nums.length / 2);
    }
}
