package programmers.level0;

public class L0_Solution_123 {
    // 외계행성의 나이: https://school.programmers.co.kr/learn/courses/30/lessons/120834
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        while (age > 0) {
            sb.insert(0, (char) ((age % 10) + (int) 'a'));
            age /= 10;
        }
        return sb.toString();
    }
}
