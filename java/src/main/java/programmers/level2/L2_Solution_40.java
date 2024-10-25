package programmers.level2;

import java.util.Stack;

public class L2_Solution_40 {
    // 주식가격: https://school.programmers.co.kr/learn/courses/30/lessons/42584
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stk = new Stack<Integer>(); // index를 담는다.
        for (int i = 0; i < prices.length; i++) {
            // 과거 값이 현재 값보다 크면
            while (!stk.isEmpty() && prices[stk.peek()] > prices[i]) {
                int past = stk.pop(); // 이전 값의 인덱스
                answer[past] = i - past; // 현재 - 이전(초)
            }
            stk.push(i);
        }
        while (!stk.isEmpty()) {
            int cur = stk.pop();
            answer[cur] = prices.length - cur - 1;
        }

        return answer;
    }
}
