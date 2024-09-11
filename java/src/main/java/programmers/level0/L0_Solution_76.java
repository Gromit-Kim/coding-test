package programmers.level0;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class L0_Solution_76 {
    // 가위 바위 보: https://school.programmers.co.kr/learn/courses/30/lessons/120839
    private static Map<Character, String> map = new HashMap();

    static {
        map.put('2', "0");
        map.put('0', "5");
        map.put('5', "2");
    }

    public String solution(String rsp) {
        return rsp.chars()
                .mapToObj(ch -> map.get((char) ch))
                .collect(Collectors.joining());
    }
}
