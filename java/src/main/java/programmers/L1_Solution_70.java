package programmers;

import java.util.Stack;

public class L1_Solution_70 {
    public int solution(int[][] board, int[] moves) {
        int n = board.length;
        int answer = 0; //

        Stack<Integer> stk = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < n; i++) {
                if (board[i][move-1] != 0) {
                    stk.push(board[i][move-1]);
                    board[i][move-1] = 0;
                    break;
                }
            }
            if (stk.size() >= 2) {
                if (stk.peek() == stk.get(stk.size() - 2)) {
                    stk.pop();
                    stk.pop();
                    answer += 2;
                }
            }
        }
        return answer;
    }
}
