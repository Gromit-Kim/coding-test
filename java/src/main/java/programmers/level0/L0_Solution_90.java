package programmers.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L0_Solution_90 {
    // 순서 바꾸기: https://school.programmers.co.kr/learn/courses/30/lessons/181891?language=java
    public int[] solution(int[] num_list, int n) {
        List<Integer> lst = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        for (int i = 0; i < num_list.length - n; i++) {
            int lastEle = lst.remove(lst.size() - 1);
            lst.add(0, lastEle);
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}
