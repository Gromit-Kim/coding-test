package programmers.level1;

import java.util.Arrays;

public class L1_Solution_69 {
    // 3page, 과일장수: https://school.programmers.co.kr/learn/courses/30/lessons/135808
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        int numOfBox = score.length / m;
        int cur = score.length;
        for(int i = 1; i <= numOfBox; i++){
            answer += score[cur - i * m] * m;
        }
        return answer;
    }
}
