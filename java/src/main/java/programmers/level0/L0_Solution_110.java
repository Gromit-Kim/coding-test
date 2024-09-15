package programmers.level0;

public class L0_Solution_110 {
    // 문자열 정렬하기 (1): https://school.programmers.co.kr/learn/courses/30/lessons/120850
    public int[] solution(String my_string) {
        return my_string.chars()
                .filter(ch -> ch >= '0' && ch <= '9')
                .map(ch -> ch - '0')
                .sorted()
                .toArray();
    }
}
