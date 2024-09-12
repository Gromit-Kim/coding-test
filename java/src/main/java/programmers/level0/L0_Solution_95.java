package programmers.level0;

public class L0_Solution_95 {
    // 자릿수 더하기: https://school.programmers.co.kr/learn/courses/30/lessons/120906
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
