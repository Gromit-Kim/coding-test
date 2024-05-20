package programmers;

import java.util.Arrays;

public class L2_Solution_3 {
    // 최솟값 만들기
    public int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);// 오름차순
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[B.length - 1 - i];
        }
        return answer;
    }
}
