package programmers;

public class L1_Solution_71 {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10, right = 12;
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                right = num;
            } else {
                int cur = num;
                if (num == 0)
                    cur = 11;
                int left_dis = (Math.abs(cur - left) / 3) + (Math.abs(cur - left) % 3);
                int right_dis = (Math.abs(cur - right) / 3) + (Math.abs(cur - right) % 3);
                if (left_dis == right_dis) {
                    if (hand.equals("right")) {
                        right = cur;
                        sb.append("R");
                    } else {
                        left = cur;
                        sb.append("L");
                    }
                } else if (left_dis > right_dis) {
                    sb.append("R");
                    right = cur;
                } else {
                    sb.append("L");
                    left = cur;
                }
            }
        }
        return sb.toString();
    }
}
