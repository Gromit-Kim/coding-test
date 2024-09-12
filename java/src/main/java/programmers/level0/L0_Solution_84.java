package programmers.level0;

import java.util.Arrays;

public class L0_Solution_84 {
    // x 사이의 개수: https://school.programmers.co.kr/learn/courses/30/lessons/181867
    public int[] solution(String myString){
        // split(구분자, limit); : limit는 최대 길이 (구분되는)
        return Arrays.stream(myString.split("x", myString.length()))
                .mapToInt(String::length)
                .toArray();
    }
}
