package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_32 {
    public int solution(int[] num_list){
        return IntStream.range(0, num_list.length)
                .filter(i -> num_list[i] < 0)
                .findFirst()
                .orElse(-1);
    }
}
