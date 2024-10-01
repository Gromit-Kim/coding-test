package programmers.level0;

public class L0_Solution_190 {
    // 분수의 덧셈: https://school.programmers.co.kr/learn/courses/30/lessons/120808
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int g = gcd(numer, denom);

        numer /= g;
        denom /= g;

        return new int[]{numer, denom};
    }

    private int gcd(int n1, int n2) {
        while (n2 != 0) {
            int tmp = n1 % n2;
            n1 = n2;
            n2 = tmp;
        }
        return n1;
    }

}
