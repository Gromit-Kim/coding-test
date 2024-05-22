package programmers;

import java.util.Stack;

public class L2_Solution_9 {
    public int solution(String s) {
        Stack<Character> stk = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stk.isEmpty() && stk.peek() == ch)
                stk.pop();
            else
                stk.push(ch);
        }
        return stk.isEmpty() ? 1 : 0;
    }
}
