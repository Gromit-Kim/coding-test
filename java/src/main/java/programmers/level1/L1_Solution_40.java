package programmers.level1;

public class L1_Solution_40 {
    // 최대공약수와 최소공배수: https://school.programmers.co.kr/learn/courses/30/lessons/12940
    public int[] solution(int n, int m) {
        return new int[] {gcd(n, m), lcm(n, m)};
    }

    private int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}
