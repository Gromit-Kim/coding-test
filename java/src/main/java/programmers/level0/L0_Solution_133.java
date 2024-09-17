package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class L0_Solution_133 {
    // 빈 배열에 추가, 삭제하기: https://school.programmers.co.kr/learn/courses/30/lessons/181860
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if (flag[i]) {
                for (int j = 0; j < n * 2; j++) {
                    lst.add(n);
                }
            } else {
                for (int j = 0; j < n; j++) {
                    lst.remove(lst.size() - 1);
                }
            }
        }
        return lst.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
