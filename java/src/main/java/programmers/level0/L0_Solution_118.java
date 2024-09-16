package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L0_Solution_118 {
    // 배열 만들기 3: https://school.programmers.co.kr/learn/courses/30/lessons/181895
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> lst = new ArrayList<>();
        for (int[] interval : intervals) {
            int[] n = Arrays.copyOfRange(arr, interval[0], interval[1]+1);
            for (int i : n) {
                lst.add(i);
            }
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}
