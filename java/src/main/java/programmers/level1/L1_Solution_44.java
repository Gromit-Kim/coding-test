package programmers.level1;

import java.util.Arrays;

public class L1_Solution_44 {
    // 예산: https://school.programmers.co.kr/learn/courses/30/lessons/12982
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for(int m : d){
            if(budget - m >= 0){
                answer++;
                budget -= m;
            }
        }
        return answer;
    }
}
