package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_126 {
    // 합성수 찾기: https://school.programmers.co.kr/learn/courses/30/lessons/120846
    public int solution(int n) {
        int answer = 0;
        for(int i = 4; i <= n; i++){
            int cnt = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0)
                    cnt++;
                if(cnt >= 3){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
