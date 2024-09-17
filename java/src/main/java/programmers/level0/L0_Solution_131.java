package programmers.level0;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class L0_Solution_131 {
    // 중복된 문자 제거: https://school.programmers.co.kr/learn/courses/30/lessons/120888
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(answer));
        return String.join("", set);
    }
}
