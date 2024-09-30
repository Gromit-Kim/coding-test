package programmers.level0;

public class L0_Solution_182 {
    // 유한 소수 판별하기: https://school.programmers.co.kr/learn/courses/30/lessons/120878
    public int solution(int a, int b) {
        int gcd = gcd(a, b);
        b /= gcd;

        // 2. 분모 b가 2와 5로만 이루어졌는지 확인
        // b를 2로 나눌 수 있을 때까지 나눔
        while (b % 2 == 0) {
            b /= 2;
        }
        // b를 5로 나눌 수 있을 때까지 나눔
        while (b % 5 == 0) {
            b /= 5;
        }

        // 3. 남은 b가 1이면 유한 소수, 아니면 무한 소수
        return (b == 1) ? 1 : 2;
    }

    public int gcd(int n1, int n2) {
        if (n2 == 0)
            return n1;
        return gcd(n2, n1 % n2);
    }

}
