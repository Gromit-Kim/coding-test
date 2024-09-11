package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class L0_Solution_66 {
    // 배열의 원소만큼 추가하기: https://school.programmers.co.kr/learn/courses/30/lessons/181861?language=java
    public int[] solution(int[] arr) {
        List<Integer> lst = new ArrayList<>();
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                lst.add(num);
            }
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}
