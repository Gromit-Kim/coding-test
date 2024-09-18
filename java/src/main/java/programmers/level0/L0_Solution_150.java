package programmers.level0;

import java.util.Map;
import java.util.TreeMap;

public class L0_Solution_150 {
    // 한 번만 등장한 문자: https://school.programmers.co.kr/learn/courses/30/lessons/120896
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new TreeMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        for(Character key : map.keySet()){
            if(map.get(key) == 1){
                sb.append(key);
            }
        }
        return sb.toString();
    }
}
