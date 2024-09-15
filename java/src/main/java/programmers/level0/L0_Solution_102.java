package programmers.level0;

public class L0_Solution_102 {
    // 점의 위치 구하기: https://school.programmers.co.kr/learn/courses/30/lessons/120841
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        if (x > 0 && y > 0)
            return 1;
        if (x > 0 && y < 0)
            return 4;
        if (x < 0 && y > 0)
            return 2;
        return 3;
    }
}
