package programmers.level0;

import java.util.Arrays;

public class L0_Solution_162 {
    // 조건에 맞게 수열 변환하기 2: https://school.programmers.co.kr/learn/courses/30/lessons/181881
    public int solution(int[] arr) {
        int answer = 0;
        while(true){
            int[] copied = Arrays.copyOf(arr, arr.length);
            for (int i = 0 ; i < copied.length ; i++) {
                if (copied[i] >= 50 && copied[i] % 2 == 0) {
                    copied[i] /= 2;
                } else if (copied[i] < 50 && copied[i] % 2 == 1) {
                    copied[i] = copied[i] * 2 + 1;
                }
            }

            if(Arrays.equals(arr, copied)){
                break;
            }
            arr = copied;
            answer++;
        }
        return answer;
    }
}
