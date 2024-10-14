package programmers.level1;

public class L1_Solution_36 {
    // 부족한 금액 계산하기: https://school.programmers.co.kr/learn/courses/30/lessons/82612
    public long solution(int price, int money, int count) {
        return Math.max(0, (long) (price * ((long) (count * (count + 1)) / 2) - money));
    }
}
