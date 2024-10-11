package programmers.level1;

public class L1_Solution_72 {
    // 덧칠하기: https://school.programmers.co.kr/learn/courses/30/lessons/161989
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int idx = 0; // 현재 처리할 인덱스
        while (idx < section.length) {
            answer++;
            int limit = section[idx] + m - 1;
            while (idx < section.length && section[idx] <= limit) {
                idx++;
            }
        }
        return answer;
    }
}
