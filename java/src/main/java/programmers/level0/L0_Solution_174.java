package programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class L0_Solution_174 {
    // 캐릭터의 좌표: https://school.programmers.co.kr/learn/courses/30/lessons/120861
    private static Map<String, Integer> map = new HashMap<>();

    static {
        map.put("up", 0);
        map.put("down", 1);
        map.put("left", 2);
        map.put("right", 3);
    }

    public int[] solution(String[] keyinput, int[] board) {
        int[] dx = new int[]{0, 0, -1, 1};
        int[] dy = new int[]{1, -1, 0, 0};

        int x = 0, y = 0;
        for (String key : keyinput) {
            int idx = map.get(key);
            int nX = x + dx[idx], nY = y + dy[idx];
            if (isPossible(nX, nY, (board[0] + 1) / 2, (board[1] + 1) / 2)) {
                x = nX;
                y = nY;
            }
        }
        return new int[]{x, y};
    }

    private boolean isPossible(int x, int y, int maxX, int maxY) {
        return -maxX < x && x < maxX && -maxY < y && y < maxY;
    }

}
