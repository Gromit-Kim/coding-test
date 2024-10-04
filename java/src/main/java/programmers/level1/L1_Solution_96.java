package programmers.level1;

import java.util.*;

public class L1_Solution_96 {
    // 신고 결과 받기: https://school.programmers.co.kr/learn/courses/30/lessons/92334
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> indices = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            indices.put(id_list[i], i);
        }

        // 누가 나를 신고했는지 담는다.
        List<Set<String>> lst = new ArrayList<>();
        for (int i = 0; i < id_list.length; i++) {
            lst.add(new HashSet<>());
        }

        for (String info : report) {
            String[] splited = info.split(" ");
            String from = splited[0], to = splited[1];
            lst.get(indices.get(to)).add(from);
        }

        int[] answer = new int[id_list.length];
        for (Set<String> strings : lst) {
            if (strings.size() >= k) {
                for (String name : strings) {
                    answer[indices.get(name)]++;
                }
            }
        }
        return answer;
    }
}
