package programmers;

import java.util.Stack;

public class L1_Solution_69 {

    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        for (int i : ingredient) {
            stk.push(i);
            if (stk.size() >= 4 && stk.peek() == 1) {
                if (stk.get(stk.size() - 2) == 3 && stk.get(stk.size() - 3) == 2 && stk.get(stk.size() - 4) == 1) {
                    answer++;
                    for (int j = 0; j < 4; j++) {
                        stk.pop();
                    }
                }
            }
        }
        return answer;
    }
}
