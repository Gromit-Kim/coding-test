package programmers.level0;

public class L0_Solution_103 {
    // 문자열 뒤집기: https://school.programmers.co.kr/learn/courses/30/lessons/120822
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        return sb.reverse().toString();
    }
}
