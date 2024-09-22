package programmers.level2;

public class L2_Solution_14 {
    // N개의 최소공배수: https://school.programmers.co.kr/learn/courses/30/lessons/12953
    public int solution(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = calcLCM(lcm, arr[i]);
        }
        return lcm;
    }

    private int calcLCM(int a, int b) {
        return a * b / calcGCD(a, b);
    }

    private int calcGCD(int n1, int n2) {
        if (n1 < n2) {
            int tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
        while (n2 != 0) {
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        return n1;
    }

}
