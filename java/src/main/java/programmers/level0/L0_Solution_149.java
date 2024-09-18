package programmers.level0;

import java.util.Arrays;

public class L0_Solution_149 {
    // 가까운 수: https://school.programmers.co.kr/learn/courses/30/lessons/120890
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        for(int i = 1; i < array.length; i++){
            if(Math.abs(n-array[0]) > Math.abs(n - array[i])){
                array[0] = array[i];
            }
        }
        return array[0];
    }
}
