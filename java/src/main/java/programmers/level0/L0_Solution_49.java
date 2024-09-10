package programmers.level0;

import java.util.Arrays;

public class L0_Solution_49 {
    // 배열의 원소 삭제하기: https://school.programmers.co.kr/learn/courses/30/lessons/181844?language=java
    public int[] solution(int[] arr, int[] delete_list){
        return Arrays.stream(arr)
                .filter(num -> Arrays.stream(delete_list).noneMatch(del -> del == num))
                .toArray();
    }
}
