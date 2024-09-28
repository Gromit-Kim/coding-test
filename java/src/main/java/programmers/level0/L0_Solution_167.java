package programmers.level0;

import java.util.Arrays;

public class L0_Solution_167 {
    // 10page - 삼각형의 완성조건(2): https://school.programmers.co.kr/learn/courses/30/lessons/120868
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int n1 = sides[0], n2 = sides[1];

        int start = n2 - n1 + 1;
        int end = n1 + n2;
        return end - start;
    }
}
