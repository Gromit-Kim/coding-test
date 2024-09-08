package programmers.level0;

public class L0_Solution_21 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120819
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money - answer[0] * 5500;
        return answer;
    }
}
