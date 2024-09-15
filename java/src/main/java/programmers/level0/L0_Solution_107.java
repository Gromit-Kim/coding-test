package programmers.level0;

public class L0_Solution_107 {
    // 배열 자르기: https://school.programmers.co.kr/learn/courses/30/lessons/120833
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = num1; i <= num2; i++)
            answer[i - num1] = numbers[i];
        return answer;
    }
}
