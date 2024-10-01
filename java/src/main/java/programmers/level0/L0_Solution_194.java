package programmers.level0;

public class L0_Solution_194 {
    // 평행: https://school.programmers.co.kr/learn/courses/30/lessons/120875
    public int solution(int[][] dots) {
        if (getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3])) {
            return 1;
        }
        if (getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3])) {
            return 1;
        }
        if (getSlope(dots[1], dots[2]) == getSlope(dots[0], dots[3])) {
            return 1;
        }
        return 0;
    }

    private double getSlope(int[] dot1, int[] dot2) {
        int x1 = dot1[0], y1 = dot1[1];
        int x2 = dot2[0], y2 = dot2[1];
        return (double) (x2 - x1) / (y2 - y1);
    }
}
