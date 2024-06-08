package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L2_Solution_40 {
    private static Map<Character, Integer> map = new HashMap<>();
    private static int[] dx = {0, 0, 1, -1}; // u d r l
    private static int[] dy = {-1, 1, 0, 0};

    static{
        map.put('U', 0);
        map.put('D', 1);
        map.put('R', 2);
        map.put('L', 3);
    }

    public int solution(String dirs) {
        Set<String> set = new HashSet<>();
        int cx = 0, cy = 0;
        for(Character ch : dirs.toCharArray()){
            int idx = map.get(ch);
            int nx = cx + dx[idx];
            int ny = cy + dy[idx];
            if(nx > 5 || nx < -5 || ny > 5 || ny < -5)
                continue;
            set.add(cx + " " + cy + " " + nx + " " + ny);
            set.add(nx + " " + ny + " " + cx + " " + cy);
            cx = nx;
            cy = ny;
        }
        return set.size() / 2;
    }
}
