package programmers;

public class L2_Solution_1 {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String str : strArr) {
            int cur = Integer.parseInt(str);
            if (max < cur) {
                max = cur;
            }
            if (min > cur) {
                min = cur;
            }
        }
        return min + " " + max;
    }
}
