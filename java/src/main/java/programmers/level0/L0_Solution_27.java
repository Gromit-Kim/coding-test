package programmers.level0;

public class L0_Solution_27 {
    // 가장 큰 수 찾기: https://school.programmers.co.kr/learn/courses/30/lessons/120899?language=java
    public int[] solution(int[] array) {
        int[] answer = {array[0], 0};
        for (int i = 1; i < array.length; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}
