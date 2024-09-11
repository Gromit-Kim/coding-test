package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_79 {
    // 배열에서 문자열 대소문자 변환하기: https://school.programmers.co.kr/learn/courses/30/lessons/181875?language=java
    public String[] solution(String[] strArr) {
        return IntStream.range(0, strArr.length)
                .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                .toArray(String[]::new);
    }
}
