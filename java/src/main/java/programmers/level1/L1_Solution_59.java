package programmers.level1;

public class L1_Solution_59 {
    // 콜라 문제: https://school.programmers.co.kr/learn/courses/30/lessons/132267
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int cnt = n / a * b;
            answer += cnt;
            n = cnt + n % a;
        }
        return answer;
    }
}
