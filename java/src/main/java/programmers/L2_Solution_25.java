package programmers;

import java.util.*;

public class L2_Solution_25 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] times = new int[progresses.length];
        for (int i = 0; i < times.length; i++) {
            int time = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                time += 1;
            }
            times[i] = time;
        }

        List<Integer> lst = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int t : times) {
            if (q.isEmpty()) {
                q.offer(t);
            } else {
                if (q.peek() >= t) {
                    q.offer(t);
                } else {
                    lst.add(q.size());
                    q.clear();
                    q.offer(t);
                }
            }
        }
        if (!q.isEmpty())
            lst.add(q.size());

        return lst.stream().mapToInt(a -> a).toArray();
    }

}
