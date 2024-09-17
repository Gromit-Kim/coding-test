package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_142 {
    // k의 개수: https://school.programmers.co.kr/learn/courses/30/lessons/120887
    public int solution(int i, int j, int k) {
        int cnt = 0;
        for (int num = i; num <= j; num++) {
            int tmp = num;
            while (tmp > 0) {
                if (tmp % 10 == k) {
                    cnt++;
                }
                tmp /= 10;
            }
        }
        return cnt;
    }
}
