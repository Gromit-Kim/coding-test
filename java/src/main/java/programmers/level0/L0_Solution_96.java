package programmers.level0;

public class L0_Solution_96 {
    // 모음제거: https://school.programmers.co.kr/learn/courses/30/lessons/120849
    public String solution(String my_string) {
        String[] dic = {"i", "a", "o", "u", "e"};
        for (String d : dic) {
            my_string = my_string.replace(d, "");
        }
        return my_string;
    }
}
