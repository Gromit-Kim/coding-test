package programmers.level2;

public class L2_Solution_66 {
    // 숫자 카드 나누기: https://school.programmers.co.kr/learn/courses/30/lessons/135807#
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = arrayA[0];
        for(int i = 1; i < arrayA.length; i++){
            gcdA = gcd(gcdA, arrayA[i]);
        }

        int gcdB = arrayB[0];
        for(int i = 1; i < arrayB.length; i++){
            gcdB = gcd(gcdB, arrayB[i]);
        }

        int resultA = check(gcdA, arrayB) ? gcdA : 0;
        int resultB = check(gcdB, arrayA) ? gcdB : 0;

        return Math.max(resultA, resultB);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private boolean check(int gcd, int[] arr) {
        for (int num : arr) {
            if (num % gcd == 0) {
                return false;
            }
        }
        return true;
    }
}
