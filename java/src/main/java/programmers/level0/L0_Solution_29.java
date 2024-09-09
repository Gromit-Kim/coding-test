package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_29 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181888
    public int[] solution(int[] num_list, int n) {
        // num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어 있는 리스트를 차례로 리턴
        return IntStream.range(0, num_list.length)
                .filter(i -> i % n == 0)
                .map(i -> num_list[i])
                .toArray();
    }
}
