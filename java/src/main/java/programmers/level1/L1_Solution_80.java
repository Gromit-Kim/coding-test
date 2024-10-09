package programmers.level1;

public class L1_Solution_80 {
    // 둘만의 암호: https://school.programmers.co.kr/learn/courses/30/lessons/155652
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            char nextChar = ch;
            int shift = 0;
            while (shift < index) {
                nextChar++;
                if (nextChar > 'z') {
                    nextChar = 'a';
                }
                if (!skip.contains(String.valueOf(nextChar))) {
                    shift++;
                }
            }
            sb.append(nextChar);
        }
        return sb.toString();
    }
}
