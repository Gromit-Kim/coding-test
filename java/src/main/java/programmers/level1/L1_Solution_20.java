package programmers.level1;

import java.util.stream.IntStream;

public class L1_Solution_20 {
    // 핸드폰 번호 가리기: https://school.programmers.co.kr/learn/courses/30/lessons/12948
    public String solution(String phone_number) {
        int idx = phone_number.length() - 4;
        StringBuilder sb = new StringBuilder();
        sb.append("*".repeat(idx)).append(phone_number.substring(idx));
        return sb.toString();
    }
}
