package programmers;

import java.util.Stack;

public class L2_Solution_2 {
    boolean solution(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            try {
                if (ch == '(')
                    stk.push(ch);
                else
                    stk.pop();
            }catch (Exception e){
                return false;
            }
        }
        return stk.isEmpty();
    }
}
