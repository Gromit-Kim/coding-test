package programmers.level1;

public class L1_Solution_66 {
    // 2016년: https://school.programmers.co.kr/learn/courses/30/lessons/12901
    private static int[] DATE_OF_MONTH = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static String[] DAY = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

    public String solution(int a, int b) {
        int date = toDate(a, b);
        return DAY[date % 7];
    }

    private int toDate(int a, int b) {
        int res = 0;
        for (int i = 0; i < a - 1; i++) {
            res += DATE_OF_MONTH[i];
        }
        return res + b - 1;
    }
}
