package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class L0_Solution_40 {
    public String solution(String my_string, int[] index_list){
        return Arrays.stream(index_list)
                .mapToObj(i -> String.valueOf((char) my_string.charAt(i)))
                .collect(Collectors.joining());
    }
}
