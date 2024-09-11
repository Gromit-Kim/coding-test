package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_74 {
    // 5명씩: https://school.programmers.co.kr/learn/courses/30/lessons/181886?language=java
    public String[] solution(String[] names){
        return IntStream.range(0, names.length)
                .filter(i -> i % 5 == 0)
                .mapToObj(i -> names[i])
                .toArray(String[]::new);
    }
}
