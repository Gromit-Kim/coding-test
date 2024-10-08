package programmers.level1;

import java.util.Arrays;

public class L1_Solution_83 {
    // 체육복: https://school.programmers.co.kr/learn/courses/30/lessons/42862
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n];
        Arrays.fill(clothes, 1);
        for (int lost_idx : lost) {
            clothes[lost_idx - 1] -= 1;
        }
        for (int reserve_idx : reserve) {
            clothes[reserve_idx - 1] += 1;
        }

        for (int i = 0; i < n; i++) {
            if (clothes[i] == 0) {
                if (i - 1 >= 0 && clothes[i - 1] == 2) {
                    clothes[i]++;
                    clothes[i - 1]--;
                } else if (i + 1 < n && clothes[i + 1] == 2) {
                    clothes[i]++;
                    clothes[i + 1]--;
                }
            }
        }

        return (int) Arrays.stream(clothes)
                .filter(item -> item > 0)
                .count();
    }
}
