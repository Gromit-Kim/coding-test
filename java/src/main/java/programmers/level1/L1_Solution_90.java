package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class L1_Solution_90 {
    // PCCE 기출문제 10번 / 데이터 분석
    private static Map<String, Integer> map = new HashMap<>();

    static {
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
    }

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        return Arrays.stream(data)
                .filter(intArr -> intArr[map.get(ext)] < val_ext)
                .sorted(Comparator.comparing((int[] d) -> d[map.get(sort_by)]))
                .toArray(int[][]::new);
    }
}
