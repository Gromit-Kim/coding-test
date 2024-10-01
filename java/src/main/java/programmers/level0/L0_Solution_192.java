package programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class L0_Solution_192 {
    // 주사위 게임 3: https://school.programmers.co.kr/learn/courses/30/lessons/181916
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        if(map.size() == 1)
            return a * 1111;
        if(map.size() == 2){
            if (map.containsValue(3)) {
                int res = 0;
                for (Map.Entry<Integer, Integer> el : map.entrySet())
                    res += el.getKey() * (el.getValue() == 3 ? 10 : 1);
                return res * res;
            }
            int x = (a + b + c + d - 2 * a) / 2;
            return (a + x) * Math.abs(a - x);
        }
        if(map.size() == 3){
            int res = 1;
            for(Map.Entry<Integer, Integer> e : map.entrySet()){
                if(e.getValue() != 2)
                    res *= e.getKey();
            }
            return res;
        }
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}
