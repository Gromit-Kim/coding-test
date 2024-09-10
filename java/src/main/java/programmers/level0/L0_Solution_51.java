package programmers.level0;

import java.util.Arrays;

public class L0_Solution_51 {
    // 접미사 배열: https://school.programmers.co.kr/learn/courses/30/lessons/181909
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}
