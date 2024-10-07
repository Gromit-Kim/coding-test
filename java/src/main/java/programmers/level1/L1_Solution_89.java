package programmers.level1;

public class L1_Solution_89 {
    // 키패드 누르기: https://school.programmers.co.kr/learn/courses/30/lessons/67256
    private static int LEFT = 10;
    private static int RIGHT = 12;

    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                LEFT = number;
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                RIGHT = number;
            } else {
                if (number == 0) {
                    number = 11;
                }
                int ldis = getDistance(number, true);
                int rdis = getDistance(number, false);
                if (ldis < rdis) {
                    sb.append("L");
                    LEFT = number;
                } else if (ldis > rdis) {
                    sb.append("R");
                    RIGHT = number;
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        RIGHT = number;
                    } else {
                        sb.append("L");
                        LEFT = number;
                    }
                }
            }
        }
        return sb.toString();
    }

    private int getDistance(int num, boolean isLeft) {
        if (isLeft) {
            return (Math.abs(num - LEFT) / 3) + (Math.abs(num - LEFT) % 3);
        }
        return (Math.abs(num - RIGHT) / 3) + (Math.abs(num - RIGHT) % 3);
    }
}
