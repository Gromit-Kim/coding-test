package programmers.level0;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class L0_Solution_98 {
    // 수 조작하기 2: https://school.programmers.co.kr/learn/courses/30/lessons/181925
    private static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(1, "w");
        map.put(-1, "s");
        map.put(10, "d");
        map.put(-10, "a");
    }

    public String solution(int[] numLog){
        return IntStream.range(1, numLog.length)
                .mapToObj(i -> map.get(numLog[i] - numLog[i-1]))
                .collect(Collectors.joining());
    }
}
