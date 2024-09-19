package programmers.level2;

import java.util.Stack;

public class L2_Solution_2 {
    public boolean solution(String s) {
        Stack<Character> stk = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stk.push('(');
            } else if (ch == ')') {
                if (!stk.isEmpty() && stk.peek() == '(') {
                    stk.pop();
                } else {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
