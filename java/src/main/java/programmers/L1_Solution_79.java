package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L1_Solution_79 {
    private static Map<String, Integer> map = new HashMap<>();

    public int[] solution(String[] id_list, String[] report, int k) {
        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], i);
        }

        int[] warn = new int[id_list.length];
        Set<String>[] reporters = new HashSet[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            reporters[i] = new HashSet<>();
        }

        for (String rep : report) {
            String[] r = rep.split(" ");
            String from = r[0], to = r[1];
            int toIdx = map.get(to);
            if (!reporters[toIdx].contains(from)) {
                warn[toIdx]++;
                reporters[toIdx].add(from);
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            if (warn[i] > k) {
                for (String name : reporters[i])
                    answer[map.get(name)]++;
            }
        }
        return answer;
    }
}
