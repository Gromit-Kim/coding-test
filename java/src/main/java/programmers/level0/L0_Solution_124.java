package programmers.level0;

public class L0_Solution_124 {
    // n보다 커질 때까지 더하기: https://school.programmers.co.kr/learn/courses/30/lessons/181884?language=java
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int num : numbers) {
            if (answer > n)
                break;
            answer += num;
        }
        return answer;
    }
}
