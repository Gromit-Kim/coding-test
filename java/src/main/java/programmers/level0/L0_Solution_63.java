package programmers.level0;

import java.util.Arrays;

public class L0_Solution_63 {
    // 문자열 정수의 합: https://school.programmers.co.kr/learn/challenges?order=acceptance_desc&languages=java&page=4&levels=0
    public int solution(String num_str){
        return Arrays.stream(num_str.split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
