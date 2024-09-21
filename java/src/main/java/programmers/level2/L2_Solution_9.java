package programmers.level2;

import java.util.Stack;

public class L2_Solution_9 {
    // 짝지어 제거: https://school.programmers.co.kr/learn/courses/30/lessons/12973
    public int solution(String s) {
        Stack<Character> stk = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ' ')
                continue;
            if (!stk.isEmpty() && stk.peek() == ch) {
                stk.pop();
            } else {
                stk.push(ch);
            }
        }
        return stk.isEmpty() ? 1 : 0;
    }
}
