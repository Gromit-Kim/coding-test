package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class L1_Solution_94 {
    // 달리기 경주: https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=java
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for (String calling : callings) {
            int cur = map.get(calling);
            if (cur > 0) {
                String prev = players[cur - 1];
                players[cur - 1] = calling;
                players[cur] = prev;

                map.put(calling, cur - 1);
                map.put(prev, cur);
            }
        }
        return players;
    }
}
