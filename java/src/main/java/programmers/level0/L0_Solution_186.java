package programmers.level0;

import java.util.Map;
import java.util.HashMap;

public class L0_Solution_186 {
    // 최빈값 구하기, 12 page : https://school.programmers.co.kr/learn/courses/30/lessons/120812
    public int solution(int[] array) {
        int maxCnt = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            int cnt = map.getOrDefault(num, 0) + 1;
            if (cnt > maxCnt) {
                maxCnt = cnt;
                answer = num;
            } else if (cnt == maxCnt) {
                answer = -1;
            }
            map.put(num, cnt);
        }
        return answer;
    }
}
