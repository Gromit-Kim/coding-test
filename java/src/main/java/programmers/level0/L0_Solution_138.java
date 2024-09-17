package programmers.level0;

import java.util.Arrays;

public class L0_Solution_138 {
    // 2차원으로 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/120842
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        for(int i = 0; i < num_list.length / n; i++){
            answer[i] = Arrays.copyOfRange(num_list, i * n, i*n + n);
        }
        return answer;
    }
}
