package programmers.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class L0_Solution_143 {
    // 모스부호(1): https://school.programmers.co.kr/learn/courses/30/lessons/120838
    private static HashMap<String, String> map = new HashMap<>();

    static{
        map.put(".-", "a");
        map.put("-...", "b");
        map.put("-.-.", "c");
        map.put("-..", "d");
        map.put(".", "e");
        map.put("..-.", "f");
        map.put("--.", "g");
        map.put("....", "h");
        map.put("..", "i");
        map.put(".---", "j");
        map.put("-.-", "k");
        map.put(".-..", "l");
        map.put("--", "m");
        map.put("-.", "n");
        map.put("---", "o");
        map.put(".--.", "p");
        map.put("--.-", "q");
        map.put(".-.", "r");
        map.put("...", "s");
        map.put("-", "t");
        map.put("..-", "u");
        map.put("...-", "v");
        map.put(".--", "w");
        map.put("-..-", "x");
        map.put("-.--", "y");
        map.put("--..", "z");
    }

    public String solution(String letter) {
        return Arrays.stream(letter.split(" "))
                .map(str -> map.get(str))
                .collect(Collectors.joining());
    }
}
