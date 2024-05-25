package programmers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L1_Solution_76 {
    private static Map<String, Integer> map = new HashMap<>();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    public int[] solution(String today, String[] terms, String[] privacies) throws Exception {
        for (String term : terms) {
            String[] t = term.split(" ");
            map.put(t[0], Integer.parseInt(t[1]));
        }

        LocalDate todayDate = LocalDate.parse(today, formatter);

        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] p = privacies[i].split(" ");
            LocalDate expirationDate = LocalDate
                    .parse(p[0], formatter)
                    .plusMonths(map.get(p[1]));

            if (expirationDate.isBefore(todayDate) || expirationDate.isEqual(todayDate)) {
                lst.add(i + 1);
            }
        }
        return lst.stream().mapToInt(a -> a).toArray();
    }
}
