package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L2_Solution_29 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/17677
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        // 다중 집합 원소를 만든다. - 두 글자씩 끊어 낸다.v
        List<String> lst1 = getMultiSetElement(str1);
        List<String> lst2 = getMultiSetElement(str2);

        // 다중집합 set1과 set2 사이의 교집합 / 합집합 을 구 한다.
        Map<String, Integer> map1 = new HashMap<>();
        for (String item : lst1) {
            map1.put(item, map1.getOrDefault(item, 0) + 1);
        }
        Map<String, Integer> map2 = new HashMap<>();
        for (String item : lst2) {
            map2.put(item, map2.getOrDefault(item, 0) + 1);
        }

        int intersectionCnt = 0;
        int unionCnt = 0;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                intersectionCnt += Math.min(map1.get(key), map2.get(key));
                unionCnt += Math.max(map1.get(key), map2.get(key));
            } else {
                unionCnt += map1.get(key);
            }
        }

        for (String key : map2.keySet()) {
            if (!map1.containsKey(key)) {
                unionCnt += map2.get(key);
            }
        }

        if (unionCnt == 0) {
            return 65536;
        }
        double sim = (double) intersectionCnt / unionCnt;
        return (int) (sim * 65536);
    }

    private List<String> getMultiSetElement(String str) {
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.matches("[A-Z]{2}"))
                lst.add(sub);
        }
        return lst;
    }

}
