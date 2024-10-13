package programmers.level1;

public class L1_Solution_51 {
    // 시저 암호: https://school.programmers.co.kr/learn/courses/30/lessons/12926
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            char next = ch;
            if (Character.isLowerCase(ch)) {
                next = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                next = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            sb.append(next);
        }
        return sb.toString();
    }
}
