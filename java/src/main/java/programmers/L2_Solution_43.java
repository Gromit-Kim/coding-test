package programmers;

import java.util.HashMap;
import java.util.Map;

public class L2_Solution_43 {
    private static Map<String, Integer> intime = new HashMap<>();
    private static Map<String, Integer> result = new HashMap<>();

    public int[] solution(int[] fees, String[] records) {
        for (String rec : records) {
            String[] str = rec.split(" ");
            if (str[2].equals("IN")) {
                intime.put(str[1], toMin(str[0]));
            } else {
                result.put(str[1], toMin(str[0]) - intime.get(str[1]) + result.getOrDefault(str[1], 0));
                intime.remove(str[1]);
            }
        }

        intime.forEach((k, v) -> {
            result.put(k, toMin("23:59") - v + result.getOrDefault(k, 0));
        });

        int[] answer = new int[result.size()];
        int idx = 0;
        for (int val : result.values()) {
            answer[idx] = fees[1];
            if (val > fees[0]) {
                answer[idx] += Math.ceil((val - fees[0]) / (double) fees[2]) * fees[3];
            }
            idx++;
        }
        return answer;
    }

    private int toMin(String s) {
        String[] splited = s.split(":");
        int min = Integer.parseInt(splited[1]);
        return min + Integer.parseInt(splited[0]) * 60;
    }
}
