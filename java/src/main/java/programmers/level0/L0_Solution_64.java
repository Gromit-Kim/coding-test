package programmers.level0;

public class L0_Solution_64 {
    // 주사위 게임1: https://school.programmers.co.kr/learn/courses/30/lessons/181839?language=java
    public int solution(int a, int b) {
        if(a % 2 == 1 && b % 2 == 1)
            return a * a + b * b;
        if(a % 2 == 0 && b % 2 == 0)
            return Math.abs(a-b);
        return 2 * (a + b);
    }
}
