package programmers.level0;

import java.util.Arrays;

public class L0_Solution_169 {
    // 수열과 구간 쿼리 2: https://school.programmers.co.kr/learn/courses/30/lessons/181923?language=java
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        int i = 0;
        for(int[] query : queries){
            int s = query[0], e = query[1], k = query[2];
            for(int j = s; j <= e; j++){
                if(arr[j] > k){
                    if(answer[i] == -1){
                        answer[i] = arr[j];
                    }else{
                        answer[i] = Math.min(answer[i], arr[j]);
                    }
                }
            }
            i++;
        }
        return answer;
    }
}
