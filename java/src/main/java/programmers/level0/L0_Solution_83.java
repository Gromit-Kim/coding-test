package programmers.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L0_Solution_83 {
    // 인덱스 바꾸기: https://school.programmers.co.kr/learn/courses/30/lessons/120895
    public String solution(String my_string, int num1, int num2) {
        List<String> lst = Arrays.stream(my_string.split("")).toList();
        Collections.swap(lst, num1, num2);
        return String.join("", lst);
    }
}
