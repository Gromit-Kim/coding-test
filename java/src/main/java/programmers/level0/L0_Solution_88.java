package programmers.level0;

import java.util.Arrays;

public class L0_Solution_88 {
    // ad 제거하기: https://school.programmers.co.kr/learn/courses/30/lessons/181870?language=java
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
                .filter(str -> !str.contains("ad"))
                .toArray(String[]::new);
    }
}
