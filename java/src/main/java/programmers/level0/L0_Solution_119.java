package programmers.level0;

import java.util.Arrays;

public class L0_Solution_119 {
    // 9로 나눈 나머지 : https://school.programmers.co.kr/learn/courses/30/lessons/181914
    public int solution(String number) {
        return Arrays.stream(number.split(""))
                .mapToInt(Integer::parseInt)
                .sum() % 9;
    }
}
