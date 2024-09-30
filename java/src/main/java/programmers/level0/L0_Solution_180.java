package programmers.level0;

public class L0_Solution_180 {
    // 치킨 쿠폰: https://school.programmers.co.kr/learn/courses/30/lessons/120884
    public int solution(int chicken) {
        int answer = 0;
        while (chicken >= 10) {
            int n = chicken / 10;
            answer += n;
            chicken = chicken % 10 + n;
        }
        return answer;
    }
}
