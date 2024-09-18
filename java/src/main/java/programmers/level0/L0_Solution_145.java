package programmers.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L0_Solution_145 {
    // 진료 순서 정하기: https://school.programmers.co.kr/learn/courses/30/lessons/120835
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], i);
        }
        Arrays.sort(emergency);

        int[] answer = new int[emergency.length];
        for (int i = emergency.length - 1; i >= 0; i--) {
            answer[map.get(emergency[i])] = emergency.length - i;
        }

        return answer;
    }
}
