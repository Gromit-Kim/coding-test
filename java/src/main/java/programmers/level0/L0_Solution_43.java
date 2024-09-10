package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class L0_Solution_43 {
    // 이어 붙인 수: https://school.programmers.co.kr/learn/courses/30/lessons/181928?language=java
    public int solution(int[] num_list) {
        String evenStr = Arrays.stream(num_list)
                .filter(i -> i % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
        String oddStr = Arrays.stream(num_list)
                .filter(i -> i % 2 == 1)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
        return Integer.parseInt(evenStr) + Integer.parseInt(oddStr);
    }
}
