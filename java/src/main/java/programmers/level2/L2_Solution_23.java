package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class L2_Solution_23 {
    // 의상: https://school.programmers.co.kr/learn/courses/30/lessons/42578
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for(String[] clothe : clothes){
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }
        int answer = 1;
        for(String key : map.keySet()){
            // 해당 의류 선택 + 1 (1은 선택하지 않는 경우)
            answer *= (map.get(key) +1);
        }
        return answer - 1; // 아무것도 입지 않는 경우 하나를 뺀다.
    }
}
