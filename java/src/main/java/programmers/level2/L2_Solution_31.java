package programmers.level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class L2_Solution_31 {
    // 프로세스: https://school.programmers.co.kr/learn/courses/30/lessons/42587
    private static final PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    public int solution(int[] priorities, int location) {
        for (int p : priorities) {
            pq.add(p);
        }

        // priorities[location]이 몇 번 째로 실행되는가?
        int cnt = 1;
        while(!pq.isEmpty()){
            // i는 priorities의 현재 위치를 파악하기 위함
            for(int i = 0; i < priorities.length; i++){
                if(priorities[i] == pq.peek()){ // 우선순위가 맞아야만 꺼낸다.
                    if(i == location){ // location과 맞추기 위해서
                        return cnt;
                    }
                    cnt++;
                    pq.poll();
                }
            }
        }
        return cnt;
    }
}
