package programmers.level1;

import java.util.PriorityQueue;

public class L1_Solution_62 {
    // 명예의 전당: https://school.programmers.co.kr/learn/courses/30/lessons/138477
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            if (pq.size() > k)
                pq.poll();
            answer[i] = pq.peek();
        }
        return answer;
    }
}
