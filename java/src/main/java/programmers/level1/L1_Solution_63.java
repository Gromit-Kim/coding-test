package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class L1_Solution_63 {
    // 추억점수: https://school.programmers.co.kr/learn/courses/30/lessons/176963
    private static Map<String, Integer> map = new HashMap<>();

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                answer[i] += map.getOrDefault(photo[i][j], 0);
            }
        }
        return answer;
    }
}
