package programmers.level0;

import java.util.Arrays;

public class L0_Solution_89 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if (sides[2] < sides[0] + sides[1])
            return 1;
        return 2;
    }
}
