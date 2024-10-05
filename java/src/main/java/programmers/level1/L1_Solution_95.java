package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class L1_Solution_95 {
    // 공원 산책
    public int[] solution(String[] park, String[] routes) {
        Map<String, int[]> map = new HashMap();
        map.put("N", new int[]{-1, 0}); // 위로 이동
        map.put("S", new int[]{1, 0});  // 아래로 이동
        map.put("W", new int[]{0, -1}); // 왼쪽으로 이동
        map.put("E", new int[]{0, 1});

        int[] cur = findStart(park);
        for (String route : routes) {
            String[] splited = route.split(" ");
            int b = Integer.parseInt(splited[1]);
            int stepX = map.get(splited[0])[0] * b;
            int stepY = map.get(splited[0])[1] * b;
            if (canMove(cur, stepX, stepY, b, park.length, park[0].length(), park)) {
                cur[0] += stepX * b;
                cur[1] += stepY * b;
            }
        }
        return cur;
    }

    private int[] findStart(String[] park) {
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') { // 'S'는 시작 위치를 나타냄
                    return new int[]{i, j};
                }
            }
        }
        return null; // 시작 위치가 없으면 null 반환
    }

    private boolean canMove(int[] cur, int stepX, int stepY, int distance, int maxX, int maxY, String[] park) {
        int x = cur[0];
        int y = cur[1];

        for (int i = 1; i <= distance; i++) {
            x += stepX;
            y += stepY;

            // 경계 체크
            if (x < 0 || x >= maxX || y < 0 || y >= maxY) {
                return false;
            }

            // 장애물 체크
            if (park[x].charAt(y) == 'X') {
                return false;
            }
        }
        return true;
    }
}
