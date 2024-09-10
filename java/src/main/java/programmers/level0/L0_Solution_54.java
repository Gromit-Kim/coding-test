package programmers.level0;

public class L0_Solution_54 {
    // 부분 문자열: https://school.programmers.co.kr/learn/courses/30/lessons/181842?language=java
    public int solution(String str1, String str2) {
        if (str2.contains(str1))
            return 1;
        return 0;
    }
}
