package programmers.level0;

public class L0_Solution_57 {
    // 부분 문자열인지 확인하기: https://school.programmers.co.kr/learn/courses/30/lessons/181843?language=java
    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}
