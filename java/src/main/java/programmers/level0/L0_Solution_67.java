package programmers.level0;

import java.util.stream.Collectors;

public class L0_Solution_67 {
    // 문자열 바꿔서 찾기: https://school.programmers.co.kr/learn/challenges?order=acceptance_desc&languages=java&page=4&levels=0
    public int solution(String myString, String pat) {
        String changed = myString.chars()
                .mapToObj(ch -> (char)ch == 'A' ? String.valueOf('B') : String.valueOf('A'))
                .collect(Collectors.joining());
        return changed.contains(pat) ? 1 : 0;
    }
}
