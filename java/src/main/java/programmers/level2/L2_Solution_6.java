package programmers.level2;

public class L2_Solution_6 {
    // 숫자의 표현: https://school.programmers.co.kr/learn/courses/30/lessons/12924
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int cur = 0;
            for(int j = i; j <= n; j++){
                cur += j;
                if(cur == n){
                    answer++;
                    break;
                }
                if(cur > n){
                    break;
                }
            }
        }
        return answer;
    }
}
