package programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class L0_Solution_41 {
    // 수 조작하기1: https://school.programmers.co.kr/learn/courses/30/lessons/181926?language=java
    public int solution(int n, String control){
        Map<Character, Integer> map = new HashMap<>();
        map.put('w', 1);
        map.put('s', -1);
        map.put('d', 10);
        map.put('a', -10);
        return n + control.chars().map(map::get).sum();
    }
}
