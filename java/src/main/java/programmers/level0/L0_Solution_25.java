package programmers.level0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class L0_Solution_25 {
    // 암호 해독: https://school.programmers.co.kr/learn/courses/30/lessons/120892?language=java
    public String solution(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(i -> i % code == code - 1)
                .mapToObj(i -> String.valueOf(cipher.charAt(i)))
                .collect(Collectors.joining());

    }
}
