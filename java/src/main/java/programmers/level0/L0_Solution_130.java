package programmers.level0;

import java.util.Arrays;

public class L0_Solution_130 {
    // 문자열 잘라서 정렬하기: https://school.programmers.co.kr/learn/courses/30/lessons/181866
    public String[] solution(String myString) {
        String[] answer = myString.replaceAll("/s+", "").split("x");
        Arrays.sort(answer);
        return Arrays.stream(answer)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);
    }
}
