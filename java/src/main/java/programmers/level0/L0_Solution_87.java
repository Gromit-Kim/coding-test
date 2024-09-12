package programmers.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L0_Solution_87 {
    // 배열 뒤집기: https://school.programmers.co.kr/learn/courses/30/lessons/120821?language=java
    public int[] solution(int[] num_list) {
        List<Integer> lst = Arrays.stream(num_list).boxed().toList();
        Collections.reverse(lst);
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}
