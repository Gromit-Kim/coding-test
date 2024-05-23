package programmers;

public class L2_Solution_13 {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while (true) {
            answer++;
            if (check(a, b)) {
                break;
            }
            a = next(a);
            b = next(b);
        }
        return answer;
    }

    private boolean check(int a, int b) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        return (a % 2 == 1) && (b - a == 1);
    }

    private int next(int n) {
        if (n % 2 == 0)
            return n / 2;
        return (n + 1) / 2;
    }
}
