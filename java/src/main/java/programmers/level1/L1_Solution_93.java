package programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L1_Solution_93 {
    // 개인정보 수집 유효기간: https://school.programmers.co.kr/learn/courses/30/lessons/150370
    private static Map<String, Integer> map = new HashMap<>();

    public int[] solution(String today, String[] terms, String[] privacies) {
        for (String term : terms) {
            String[] splited = term.split(" ");
            map.put(splited[0], Integer.parseInt(splited[1]));
        }

        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] splitedP = privacies[i].split(" ");
            if (!isValid(today, splitedP[0], splitedP[1])) {
                lst.add(i + 1);
            }
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean isValid(String today, String target, String policy) {
        String[] splitedToday = today.split("\\.");
        int todayYear = Integer.parseInt(splitedToday[0]);
        int todayMonth = Integer.parseInt(splitedToday[1]);
        int todayDay = Integer.parseInt(splitedToday[2]);

        String[] splitedTarget = target.split("\\.");
        int targetYear = Integer.parseInt(splitedTarget[0]);
        int targetMonth = Integer.parseInt(splitedTarget[1]);
        int targetDay = Integer.parseInt(splitedTarget[2]);

        targetMonth += map.get(policy);
        while (targetMonth > 12) {
            targetYear += 1;
            targetMonth -= 12;
        }

        if (targetYear < todayYear) return false;
        if (targetYear == todayYear && targetMonth < todayMonth) return false;
        if (targetYear == todayYear && targetMonth == todayMonth && targetDay <= todayDay) return false;

        return true;
    }
}
