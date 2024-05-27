package programmers;

import java.util.Stack;

public class L2_Solution_19 {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            String slide = leftRotate(s, i);
            if (isRight(slide)) {
                answer++;
            }
        }
        return answer;
    }

    private String leftRotate(String s, int step) {
        char[] chars = s.toCharArray();
        for (int st = 0; st < step; st++) {
            for (int i = 0; i < s.length(); i++) {
                int j;
                char first = s.charAt(0);
                for (j = 0; j < s.length() - 1; j++) {
                    chars[j] = s.charAt(j + 1);
                }
                chars[j] = first;
            }
        }
        return new String(chars);
    }

    private boolean isRight(String s) {
        if(s.chars().filter(c -> c == '{').count() != s.chars().filter(c -> c == '}').count()){
            return false;
        }
        if(s.chars().filter(c -> c == '(').count() != s.chars().filter(c -> c == ')').count()){
            return false;
        }
        if(s.chars().filter(c -> c == '[').count() != s.chars().filter(c -> c == ']').count()){
            return false;
        }
        Stack<Character> stk = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stk.push(ch);
                continue;
            }
            if (!stk.isEmpty() && stk.peek() == ch) {
                stk.pop();
            }
        }
        return stk.isEmpty();
    }
}
