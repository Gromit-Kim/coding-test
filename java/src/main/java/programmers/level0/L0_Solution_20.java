package programmers.level0;

public class L0_Solution_20 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/120818?language=java
    public int solution(int price) {
        if (price >= 500_000)
            return (int) (price * 0.8);
        if (price >= 300_000)
            return (int) (price * 0.9);
        if (price >= 100_000)
            return (int) (price * 0.95);
        return price;
    }
}
