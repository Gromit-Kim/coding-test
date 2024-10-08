package programmers.level1;

import java.util.*;

public class L1_Solution_85 {
    // 숫자 짝궁: https://school.programmers.co.kr/learn/courses/30/lessons/131128

    private static Map<String, Integer> mapX = new HashMap<>();
    private static Map<String, Integer> mapY = new HashMap<>();

    public String solution(String X, String Y) {
        for (String item : X.split("")) {
            mapX.put(item, mapX.getOrDefault(item, 0) + 1);
        }
        for (String item : Y.split("")) {
            mapY.put(item, mapY.getOrDefault(item, 0) + 1);
        }

        List<Integer> lst = new ArrayList<>();
        for (String xKey : mapX.keySet()) {
            if (mapY.containsKey(xKey)) {
                int cnt = Math.min(mapX.get(xKey), mapY.get(xKey));
                for (int i = 0; i < cnt; i++) {
                    lst.add(Integer.parseInt(xKey));
                }
            }
        }
        lst.sort(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Integer l : lst) {
            sb.append(l);
        }
        String res = sb.toString();
        if (res.isEmpty())
            return "-1";
        if (res.charAt(0) == '0')
            return "0";
        return res;
    }
}
