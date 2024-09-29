package programmers.level0;

public class L0_Solution_175 {
    // 직사각형 넓이 구하기: https://school.programmers.co.kr/learn/courses/30/lessons/120860
    public int solution(int[][] dots) {
        int min_x = 256, min_y = 256;
        int max_x = -256, max_y = -256;
        for(int[] dot : dots){
            int x = dot[0], y = dot[1];
            min_x = Math.min(min_x, x);
            min_y = Math.min(min_y, y);
            max_x = Math.max(max_x, x);
            max_y = Math.max(max_y, y);
        }
        return (max_x - min_x) * (max_y - min_y);
    }
}
