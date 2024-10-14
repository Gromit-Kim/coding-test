package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class L2_Solution_24 {
    // 기능개발: https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java
    public int[] solution(int[] progresses, int[] speeds) {
        int[] times = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            times[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        List<Integer> lst = new ArrayList<>();
        int idx = 0;
        while (idx < times.length) {
            int limit = times[idx];
            int cnt = 0;
            while (idx < times.length && times[idx] <= limit) {
                cnt++;
                idx++;
            }
            lst.add(cnt);
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}
