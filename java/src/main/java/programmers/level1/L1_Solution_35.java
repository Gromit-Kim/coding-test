package programmers.level1;

import java.util.Arrays;

public class L1_Solution_35 {
    // 문자열 내림차순으로 배치하기: https://school.programmers.co.kr/learn/courses/30/lessons/12917
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for(char ch : chars){
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}
