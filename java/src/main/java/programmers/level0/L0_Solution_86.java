package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_86 {
    // 할 일 목록: https://school.programmers.co.kr/learn/courses/30/lessons/181885
    public String[] solution(String[] todo_list, boolean[] finished) {
        return IntStream.range(0, todo_list.length)
                .filter(i -> !finished[i])
                .mapToObj(i -> todo_list[i])
                .toArray(String[]::new);
    }
}
