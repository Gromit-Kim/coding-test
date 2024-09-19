package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class L0_Solution_160 {
    // 잘라서 배열로 저장하기: https://school.programmers.co.kr/learn/courses/30/lessons/120913
    public String[] solution(String my_str, int n) {
        List<String> lst = new ArrayList<>();
        int i = 0;
        for(; i < my_str.length() - n; i += n){
            lst.add(my_str.substring(i, i+n));
        }
        lst.add(my_str.substring(i));
        return lst.stream().toArray(String[]::new);
    }
}
