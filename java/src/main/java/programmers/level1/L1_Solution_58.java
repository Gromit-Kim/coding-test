package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class L1_Solution_58 {
    // 문자열 내 마음대로 정렬하기: https://school.programmers.co.kr/learn/courses/30/lessons/12915
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n))
                    return 1;
                if (o1.charAt(n) == o2.charAt(n))
                    return o1.compareTo(o2);
                if (o1.charAt(n) < o2.charAt(n))
                    return -1;
                return 0;
            }
        });
        return strings;
    }
}
