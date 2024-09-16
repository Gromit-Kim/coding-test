package programmers.level0;

import java.util.stream.Collectors;

public class L0_Solution_116 {
    // 문자열 정렬하기 (2): https://school.programmers.co.kr/learn/courses/30/lessons/120911
    public String solution(String my_string) {
        return my_string.toLowerCase()
                .chars()
                .sorted()
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());
    }
}
