package programmers.level0;

public class L0_Solution_85 {
    // 특별한 이차원 배열 1 : https://school.programmers.co.kr/learn/courses/30/lessons/181833
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++)
            answer[i][i] = 1;
        return answer;
    }
}
