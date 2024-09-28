package programmers.level0;

public class L0_Solution_173 {
    // 문자열 겹처쓰기: https://school.programmers.co.kr/learn/courses/30/lessons/181943
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0, s))
                .append(overwrite_string)
                .append(my_string.substring(s + overwrite_string.length(),my_string.length()));
        return sb.toString();
    }
}
