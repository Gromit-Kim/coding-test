package programmers.level0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class L0_Solution_156 {
    // qr code: https://school.programmers.co.kr/learn/courses/30/lessons/181903
    public String solution(int q, int r, String code) {
        return IntStream.range(0, code.length())
                .filter(i -> i % q == r)
                .mapToObj(i -> String.valueOf(code.charAt(i)))
                .collect(Collectors.joining());
    }
}
