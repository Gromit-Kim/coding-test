package programmers.level0;

public class L0_Solution_80 {
    // 원하는 문자열 찾기: https://school.programmers.co.kr/learn/courses/30/lessons/181878?language=java
    public int solution(String myString, String pat) {
        if (myString.toLowerCase().contains(pat.toLowerCase()))
            return 1;
        return 0;
    }
}
