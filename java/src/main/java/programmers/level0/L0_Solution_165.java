package programmers.level0;

public class L0_Solution_165 {
    // 10page - 문자열 여러 번 뒤집기: https://school.programmers.co.kr/learn/courses/30/lessons/181913
    public String solution(String my_string, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0], e = query[1];
            StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
            my_string = my_string.substring(0, s)
                    + sb.reverse().toString()
                    + my_string.substring(e + 1);
        }
        return my_string;
    }
}
