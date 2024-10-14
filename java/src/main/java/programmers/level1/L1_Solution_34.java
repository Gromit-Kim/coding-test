package programmers.level1;

import java.util.stream.IntStream;

public class L1_Solution_34 {
    // 약수의 개수 덧셈: https://school.programmers.co.kr/learn/courses/30/lessons/77884
    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right)
                .map(this::calc)
                .sum();
    }

    private int calc(int n) {
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n)
                cnt++;
            if (n % i == 0)
                cnt += 2;
        }
        return cnt % 2 == 0 ? n : -n;
    }
}
