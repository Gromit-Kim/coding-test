package programmers.level2;

import java.util.Stack;

public class L2_Solution_45 {
    // 택배상자:  https://school.programmers.co.kr/learn/courses/30/lessons/131704 , 3page
    public int solution(int[] order) {
        Stack<Integer> stk = new Stack<>();

        int answer = 0;
        int n = order.length; // 상자는 1이상 n이하
        int curIdx = 0;

        for (int box = 1; box <= n; box++) {
            while (!stk.isEmpty() && stk.peek() == order[curIdx]) {
                stk.pop();
                answer++;
                curIdx++;
            }
            if (box == order[curIdx]) {
                answer++;
                curIdx++;
            } else {
                stk.push(box);
            }
        }
        while (!stk.isEmpty()) {
            if (stk.peek() == order[curIdx]) {
                stk.pop();
                curIdx++;
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}
