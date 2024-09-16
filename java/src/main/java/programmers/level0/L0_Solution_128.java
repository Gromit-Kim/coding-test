package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_128 {
    // 세로 읽기:  https://school.programmers.co.kr/learn/courses/30/lessons/181904
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i = c - 1; i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}
