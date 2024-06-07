package programmers;

import java.util.Arrays;
import java.util.Stack;

public class L2_Solution_37 {
    // 뒤에 있는 큰 수 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/154539
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);

        Stack<Integer> stk = new Stack<>(); // index를 담는다.
        for (int i = 0; i < numbers.length; i++) {
            while (!stk.isEmpty() && numbers[stk.peek()] < numbers[i]) {
                answer[stk.pop()] = numbers[i];
            }
            stk.push(i);
        }
        return answer;
    }
}
