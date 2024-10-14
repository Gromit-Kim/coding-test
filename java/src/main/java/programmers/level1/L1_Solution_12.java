package programmers.level1;

public class L1_Solution_12 {
    // 하샤드의 수: https://school.programmers.co.kr/learn/courses/30/lessons/12947
    public boolean solution(int x) {
        int s = splitSum(x);
        return x % s == 0;
    }

    private int splitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
