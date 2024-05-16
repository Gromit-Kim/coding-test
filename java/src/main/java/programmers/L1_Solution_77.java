package programmers;

import java.util.HashMap;
import java.util.Map;

public class L1_Solution_77 {
    private static Map<String, Integer> map = new HashMap<>();

    public String[] solution(String[] players, String[] callings) {
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for(String calling : callings){
            int c_idx = map.get(calling);
            String tmp = players[c_idx-1];
            players[c_idx-1] = calling;
            players[c_idx] = tmp;
            map.put(calling, c_idx-1);
            map.put(tmp, c_idx);
        }
        return players;
    }
}
