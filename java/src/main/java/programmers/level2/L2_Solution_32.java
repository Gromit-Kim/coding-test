package programmers.level2;

public class L2_Solution_32 {
    // [3차] n진수 게임: https://school.programmers.co.kr/learn/courses/30/lessons/17687
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= t * m; i++) {
            sb.append(Integer.toString(i, n).toUpperCase());
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (i % m == p - 1) {
                sb2.append(ch);
            }
        }
        return sb2.substring(0, t);
    }
}
