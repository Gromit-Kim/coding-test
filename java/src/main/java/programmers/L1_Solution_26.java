package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L1_Solution_26 {
    public int[] solution(String s) {
        String[] parts = s.substring(2, s.length() - 2).replace("},{", " ").split(" ");

        List<List<Integer>> tuples = new ArrayList<>();
        for (String part : parts) {
            String[] nums = part.split(",");
            List<Integer> t = new ArrayList<>();
            for (String num : nums) {
                t.add(Integer.parseInt(num));
            }
            tuples.add(t);
        }
        Collections.sort(tuples, (a, b) -> Integer.compare(a.size(), b.size()));

        List<Integer> lst = new ArrayList<>();
        for (List<Integer> t : tuples) {
            for (Integer n : t) {
                if (!lst.contains(n))
                    lst.add(n);
            }
        }
        return lst.stream().mapToInt(a -> a).toArray();
    }
}
