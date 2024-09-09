package programmers.level0;

public class L0_Solution_37 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181908?language=java
    public int solution(String my_string, String is_suffix){
        if(my_string.endsWith(is_suffix))
            return 1;
        return 0;
    }
}
