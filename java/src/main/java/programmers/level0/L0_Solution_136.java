package programmers.level0;

public class L0_Solution_136 {
    // 문자열 뒤집기: https://school.programmers.co.kr/learn/challenges?order=acceptance_desc&levels=0&languages=java&page=8
    public String solution(String my_string, int s, int e) {
        return my_string.substring(0, s)
                + new StringBuilder(my_string.substring(s, e+1)).reverse().toString()
                + my_string.substring(e+1);
    }
}
