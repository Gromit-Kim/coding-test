package programmers.level1;

public class L1_Solution_31 {
    // 내적: https://school.programmers.co.kr/learn/courses/30/lessons/70128
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
