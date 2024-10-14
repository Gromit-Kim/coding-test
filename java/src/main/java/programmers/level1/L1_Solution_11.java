package programmers.level1;

public class L1_Solution_11 {
    // 정수 제곱근 판별: https://school.programmers.co.kr/learn/courses/30/lessons/12934
    public long solution(long n) {
        if (Math.pow((int) Math.sqrt(n), 2) == n)
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        return -1;
    }
}
