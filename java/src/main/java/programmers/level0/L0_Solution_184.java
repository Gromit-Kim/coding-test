package programmers.level0;

public class L0_Solution_184 {
    // 다항식 더하기: https://school.programmers.co.kr/learn/courses/30/lessons/120863
    public String solution(String polynomial) {
        int x = 0;
        int n = 0;

        for (String p : polynomial.split(" ")) {
            if (p.contains("x")) {
                if (p.equals("x")) {
                    x += 1;
                } else {
                    x += Integer.parseInt(p.substring(0, p.length() - 1));
                }
            } else if (!p.equals("+")) {
                n += Integer.parseInt(p);
            }
        }

        if (x == 0 && n == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        if (x != 0) {
            if (x == 1) {
                result.append("x");
            } else {
                result.append(x).append("x");
            }
        }
        if (n != 0) {
            if (x != 0) {
                result.append(" + ");
            }
            result.append(n);
        }

        return result.toString();
    }
}
