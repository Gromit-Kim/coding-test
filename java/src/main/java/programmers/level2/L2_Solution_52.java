package programmers.level2;

import java.util.Arrays;

public class L2_Solution_52 {
    // 가장 큰 수: https://school.programmers.co.kr/learn/courses/30/lessons/42746
    public String solution(int[] numbers) {
        String[] strNumbers = Arrays.stream(numbers).mapToObj(n -> String.valueOf(n)).toArray(String[]::new);

        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

        if (strNumbers[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String num : strNumbers) {
            sb.append(num);
        }
        return sb.toString();
    }
}
