package programmers.level0;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class L0_Solution_168 {
    // 무작위로 k개의 수 뽑기: https://school.programmers.co.kr/learn/courses/30/lessons/181858?language=java
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
            if (set.size() == k)
                break;
        }

        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int i = 0;
        for (int num : set) {
            answer[i++] = num;
        }
        return answer;
    }
}
