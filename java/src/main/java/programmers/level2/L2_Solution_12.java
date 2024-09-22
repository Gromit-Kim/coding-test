package programmers.level2;

import java.util.Arrays;

public class L2_Solution_12 {
    // 구명보트: https://school.programmers.co.kr/learn/courses/30/lessons/42885
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int light = 0;
        int heavy = people.length - 1;
        while(light <= heavy){
            if(people[light] + people[heavy] <= limit)
                light++;
            heavy--;
            answer++;
        }
        return answer;
    }
}
