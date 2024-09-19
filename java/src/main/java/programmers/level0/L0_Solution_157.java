package programmers.level0;

import java.util.Arrays;

public class L0_Solution_157 {
    // 리스트 자르기: https://school.programmers.co.kr/learn/courses/30/lessons/181897
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if(n == 1)
            return Arrays.copyOfRange(num_list, 0, b+1);
        if(n == 2)
            return Arrays.copyOfRange(num_list, a, num_list.length);
        if(n == 3)
            return Arrays.copyOfRange(num_list, a, b+1);
        int[] answer = new int[(b - a + c) / c];
        int j = 0;
        for(int i = a; i <= b; i += c){
            answer[j++] = num_list[i];
        }
        return answer;
    }
}
