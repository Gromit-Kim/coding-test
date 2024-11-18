package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class L2_Solution_58 {
    // 삼각 달팽이: https://school.programmers.co.kr/learn/courses/30/lessons/68645
    private static final List<int[]> lst = new ArrayList<>();

    public int[] solution(int n) {
        for (int i = 1; i <= n; i++) {
            lst.add(new int[i]);
        }

        int x = -1, y = 0;
        int num = 1;
        // i: 방향을 바꾸는 횟수
        for (int i = 0; i < n; i++) {
            // n - i -1 : 현재 방향에서 채워야하는 숫자의 수
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x += 1;
                } else if (i % 3 == 1) {
                    y += 1;
                } else if (i % 3 == 2) {
                    x -= 1;
                    y -= 1;
                }
                lst.get(x)[y] = num++;
            }
        }
        int[] answer = new int[num - 1];
        int k = 0;
        for (int[] arr : lst) {
            for (int item : arr) {
                answer[k++] = item;
            }
        }
        return answer;
    }

}
