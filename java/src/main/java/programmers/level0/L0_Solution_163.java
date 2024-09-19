package programmers.level0;

import java.util.Stack;

public class L0_Solution_163 {
    // 배열 만들기 6: https://school.programmers.co.kr/learn/courses/30/lessons/181859
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.push(arr[i++]);
            } else {
                if (stk.peek() == arr[i]) {
                    stk.pop();
                    i++;
                } else {
                    stk.add(arr[i++]);
                }
            }
        }
        if (stk.isEmpty())
            return new int[]{-1};
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
