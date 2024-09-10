package programmers.level0;

public class L0_Solution_58 {
    // 0 떼기: https://school.programmers.co.kr/learn/courses/30/lessons/181847?language=java
    public String solution(String n_str) {
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) != '0'){
                return n_str.substring(i);
            }
        }
        return n_str;
    }
}
