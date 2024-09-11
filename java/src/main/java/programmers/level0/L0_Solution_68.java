package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class L0_Solution_68 {
    // l로 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/181834?language=java
    public String solution(String myString) {
        return Arrays.stream(myString.split(""))
                .map(ch -> ch.compareTo("l") < 0 ? "l" : ch)
                .collect(Collectors.joining());
    }
}
