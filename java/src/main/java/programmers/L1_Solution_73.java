package programmers;


import java.util.*;

public class L1_Solution_73 {
    private static Map<String, Integer> map = new HashMap<>();

    static {
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
    }

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> lst = new ArrayList<>();
        for (int[] d : data) {
            if (d[map.get(ext)] < val_ext) {
                lst.add(d);
            }
        }
        return lst.stream()
                .sorted(Comparator.comparingInt(x -> x[map.get(sort_by)]))
                .toArray(int[][]::new);
    }
}
