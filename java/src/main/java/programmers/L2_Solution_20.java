package programmers;

import java.util.HashMap;
import java.util.Map;

public class L2_Solution_20 {
    private static Map<String, Integer> w = new HashMap<>();

    public int solution(String[] want, int[] number, String[] discount) {
        for(int i = 0; i < want.length; i++){
            w.put(want[i], number[i]);
        }

        int answer = 0;
        for(int start = 0; start <= discount.length - 10; start++){
            Map<String, Integer> map = new HashMap<>();
            for(int i = start; i < start + 10; i++){
                map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
            }
            boolean flag = true;
            for(String s : want){
                if(map.get(s) != w.get(s)){
                    flag = false;
                }
            }
            if(flag) answer++;
        }
        return answer;
    }
}
