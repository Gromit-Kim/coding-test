package programmers.level0;

public class L0_Solution_19 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120814?language=java
    public int solution(int n) {
        if (n % 7 != 0)
            return n / 7 + 1;
        return n / 7;
    }
}
