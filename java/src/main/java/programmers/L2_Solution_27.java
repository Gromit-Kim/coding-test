package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class L2_Solution_27 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Info> q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            q.add(new Info(i, priorities[i]));
        }

        while (!q.isEmpty()) {
            Info info = q.poll();
            boolean flag = false;
            for (Info i : q) {
                if (i.p > info.p) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                q.add(info);
            } else {
                answer++;
                if (location == info.idx) {
                    break;
                }
            }
        }
        return answer;
    }
}

class Info {
    public int idx;
    public int p;

    public Info(int idx, int p) {
        this.idx = idx;
        this.p = p;
    }
}
