package programmers.level1;

import java.util.Arrays;
import java.util.List;

public class L1_Solution_17 {
    public int solution(int[] numbers) {
        List<Integer> lst = Arrays.stream(numbers)
                .boxed()
                .toList();
        int answer = 0;
        for (int i = 1; i <= 9; i++) {
            if (!lst.contains(i))
                answer += i;
        }
        return answer;
    }
}
