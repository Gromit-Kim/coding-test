package programmers;

import java.util.Stack;

public class L2_Solution_38 {
    // 주식가격 : https://school.programmers.co.kr/learn/courses/30/lessons/42584
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < prices.length - 1; i++) {
            while (!stk.isEmpty() && answer[stk.peek()] > prices[i]) {
                int past = stk.pop();
                answer[past] = i - past - 1;
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            int cur = stk.pop();
            answer[cur] = prices.length - cur - 1;
        }
        return answer;
    }
}
