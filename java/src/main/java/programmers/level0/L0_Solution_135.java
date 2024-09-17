package programmers.level0;

import java.util.HashSet;
import java.util.Set;

public class L0_Solution_135 {
    // 글자 지우기: https://school.programmers.co.kr/learn/courses/30/lessons/181900
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();

        Set<Integer> set = new HashSet<>();
        for(int index : indices){
            set.add(index);
        }

        for(int i = 0; i < my_string.length(); i++){
            if(!set.contains(i)){
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}
