package programmers.level1;

import java.util.Stack;

public class L1_Solution_41 {
    // 같은 숫자는 싫어: https://school.programmers.co.kr/learn/courses/30/lessons/12906
    public int[] solution(int []arr) {
        Stack<Integer> stk = new Stack<>();
        for(int item : arr){
            if(stk.isEmpty() || stk.peek() != item){
                stk.push(item);
            }
        }
        int[] answer = new int[stk.size()];
        int idx = stk.size() - 1;
        while(!stk.isEmpty()){
            answer[idx--] = stk.pop();
        }
        return answer;
    }
}
