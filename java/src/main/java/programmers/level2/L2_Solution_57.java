package programmers.level2;

import java.util.Stack;

public class L2_Solution_57 {
    // 큰 수 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/42883?language=java
    public String solution(String number, int k){
        Stack<Integer> stk = new Stack<>();
        for(String num : number.split("")){
            int n = Integer.parseInt(num);
            while(!stk.isEmpty() && stk.peek() < n && k-- > 0){
                stk.pop();
            }
            stk.push(n);
        }

        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}
