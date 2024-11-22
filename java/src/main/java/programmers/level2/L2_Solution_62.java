package programmers.level2;

public class L2_Solution_62 {
    // 프로그래머스 L2 - 124의 나라, 4page
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int remainder = n % 3;
            if (remainder == 0) {
                sb.append("4");
                n = (n / 3) - 1;
            } else {
                sb.append(remainder);
                n /= 3;
            }
        }
        return sb.reverse().toString();
    }
}
