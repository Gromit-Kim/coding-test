package programmers.level1;

public class L1_Solution_33 {
    // 수박수박수박수박수박수? : https://school.programmers.co.kr/learn/courses/30/lessons/12922
    private static char[] pattern = {'수', '박'};

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(pattern[i % 2]);
        }
        return sb.toString();
    }
}
