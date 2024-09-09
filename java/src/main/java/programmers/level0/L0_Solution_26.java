package programmers.level0;

import java.util.stream.Collectors;

public class L0_Solution_26 {
    // 대문자와 소문자: https://school.programmers.co.kr/learn/courses/30/lessons/120893
    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(ch -> {
                    if (Character.isUpperCase(ch))
                        return String.valueOf((char) Character.toLowerCase(ch));
                    return String.valueOf((char) Character.toUpperCase(ch));
                })
                .collect(Collectors.joining());
    }
}
