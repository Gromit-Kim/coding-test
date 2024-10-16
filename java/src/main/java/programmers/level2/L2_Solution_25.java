package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class L2_Solution_25 {
    // [1차] 캐시: https://school.programmers.co.kr/learn/courses/30/lessons/17680
    private static Queue<String> q = new LinkedList<>();

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        for(String city : cities){
            String c = city.toLowerCase();
            if(q.contains(c)){
                answer+=1;
                q.remove(c);
                q.add(c);
            }else{
                answer+= 5;
                q.add(c);
                if(q.size() > cacheSize){
                    q.poll();
                }
            }
        }
        return answer;
    }
}
