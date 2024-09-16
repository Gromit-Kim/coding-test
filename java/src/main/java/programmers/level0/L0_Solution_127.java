package programmers.level0;

public class L0_Solution_127 {
    // 이차원 배열 대각선 순회하기: https://school.programmers.co.kr/learn/courses/30/lessons/181829
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length && i <= k; i++) {
            for (int j = 0; j < board[i].length && j + i <= k; j++) {
                answer += board[i][j];
            }
        }
        return answer;
    }
}
