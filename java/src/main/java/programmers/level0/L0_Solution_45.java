package programmers.level0;

public class L0_Solution_45 {
    // 두수의 연산값 비교하기: https://school.programmers.co.kr/learn/courses/30/lessons/181938?language=java
    public int solution(int a, int b) {
        int concated = concat(a, b);
        if (concated >= 2 * a * b)
            return concated;
        return 2 * a * b;
    }

    private int concat(int a, int b) {
        int len = (int) (Math.log10(b) + 1);
        return a * (int) Math.pow(10, len) + b;
    }
}
