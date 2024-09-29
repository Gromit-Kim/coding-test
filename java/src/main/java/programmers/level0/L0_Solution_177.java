package programmers.level0;

import java.util.Comparator;
import java.util.stream.IntStream;

public class L0_Solution_177 {
    // 전국 대회 선발 고사: https://school.programmers.co.kr/learn/courses/30/lessons/181851
    public int solution(int[] rank, boolean[] attendance) {
        int[] students = IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .boxed()
                .sorted(Comparator.comparingInt(i -> rank[i]))
                .mapToInt(i -> i)
                .toArray();
        return 10000 * students[0] + 100 * students[1] + students[2];
    }
}
