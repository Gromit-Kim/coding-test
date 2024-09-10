package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class L0_Solution_53 {
    // 꼬리 문자열: https://school.programmers.co.kr/learn/courses/30/lessons/181841?language=java
    public String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list)
                .filter(str -> !str.contains(ex))
                .collect(Collectors.joining());
    }
}
