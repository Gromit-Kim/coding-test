package programmers.level2;

import java.util.Stack;

public class L2_Solution_19 {
    // 괄호 회전하기: https://school.programmers.co.kr/learn/courses/30/lessons/76502
    public int solution(String s) {
        int answer = 0;


        for (int i = 0; i < s.length(); i++) {
            s = leftRotate(s);
            if (isRight(s)) {
                answer++;
            }
        }
        return answer;
    }

    private String leftRotate(String s) {
        char first = s.charAt(0);
        return s.substring(1) + first;
    }

    private boolean isRight(String s) {
        Stack<Character> stk = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stk.push(ch);
            } else if (!stk.isEmpty()) {
                if (ch == ']' && stk.peek() == '[')
                    stk.pop();
                if (ch == '}' && stk.peek() == '{')
                    stk.pop();
                if (ch == ')' && stk.peek() == '(')
                    stk.pop();
            } else{
                return false;
            }
        }
        return stk.isEmpty();
    }
}
