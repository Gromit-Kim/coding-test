package programmers.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L2_Solution_26 {
    // 튜플: https://school.programmers.co.kr/learn/courses/30/lessons/64065

    public int[] solution(String s) {
        String[] splited = s.replaceAll("[{]|[}]]", " ").trim().split(" ");

        Arrays.sort(splited, (a, b) -> a.length() - b.length());

        Set<String> set = new HashSet<>();
        int[] answer = new int[splited.length];
        int idx = 0;
        for (String s1 : splited) {
            for (String s2 : s1.split(",")) {
                if (set.add(s2)) {
                    answer[idx++] = Integer.parseInt(s2);
                }
            }
        }
        return answer;
    }
}
