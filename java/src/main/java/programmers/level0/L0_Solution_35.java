package programmers.level0;

public class L0_Solution_35 {
    // 접두사인지 확인하기: https://school.programmers.co.kr/learn/courses/30/lessons/181906
    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) {
            return 1;
        }
        return 0;
    }
}
