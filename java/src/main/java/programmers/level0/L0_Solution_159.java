package programmers.level0;

public class L0_Solution_159 {
    // 이진수 더하기: https://school.programmers.co.kr/learn/courses/30/lessons/120885
    public String solution(String bin1, String bin2) {
        int n1 = Integer.parseInt(bin1, 2);
        int n2 = Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(n1+n2);
    }
}
