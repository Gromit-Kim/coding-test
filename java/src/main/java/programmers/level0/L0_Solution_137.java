package programmers.level0;

import java.util.Arrays;

public class L0_Solution_137 {
    // 배열 만들기 5: https://school.programmers.co.kr/learn/courses/30/lessons/181912
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                .mapToInt(str -> Integer.parseInt(str.substring(s, s + l)))
                .filter(num -> num > k)
                .toArray();
    }
}
