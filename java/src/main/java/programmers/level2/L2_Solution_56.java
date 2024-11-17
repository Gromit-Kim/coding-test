package programmers.level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class L2_Solution_56 {
    // 두 큐 합 같게 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/118667
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        long sum1 = sum(queue1);
        long sum2 = sum(queue2);

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }

        while (sum1 != sum2) {
            if (answer > (queue1.length + queue2.length) * 2) {
                return -1;
            }
            if (sum1 < sum2) {
                int val = q2.poll();
                q1.add(val);
                sum1 += (long) val;
                sum2 -= (long) val;
            } else if (sum1 > sum2) {
                int val = q1.poll();
                q2.add(val);
                sum1 -= (long) val;
                sum2 += (long) val;
            } else {
                break;
            }
            answer++;
        }

        return answer;
    }

    private long sum(int[] queue) {
        return Arrays.stream(queue).sum();
    }
}
