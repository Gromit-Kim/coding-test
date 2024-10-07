package programmers.level1;

import java.util.Stack;

public class L1_Solution_88 {
    // 크레인 인형 뽑기: https://school.programmers.co.kr/learn/courses/30/lessons/64061
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    if (!stk.isEmpty() && stk.peek() == board[i][move - 1]) {
                        stk.pop();
                        answer += 2;
                    } else {
                        stk.push(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
