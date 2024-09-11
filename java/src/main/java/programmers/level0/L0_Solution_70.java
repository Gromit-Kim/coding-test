package programmers.level0;

public class L0_Solution_70 {
    // 공백으로 구분하기 2: https://school.programmers.co.kr/learn/courses/30/lessons/181868?language=java
    public String[] solution(String my_string) {
        return my_string.trim().split("\\s+");
    }
}
