package programmers.level0;

public class L0_Solution_39 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181911?language=java
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            sb.append(my_strings[i].substring(start, end + 1));
        }
        return sb.toString();
    }
}
