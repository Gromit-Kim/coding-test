package programmers.level1;

public class L1_Solution_47 {
    // 이상한 문자 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/12930
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splited = s.split(" ", -1);
        for (String str : splited) {
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (i % 2 == 0) {
                    ch = Character.toUpperCase(ch);
                }
                sb.append(ch);
            }
            sb.append(" ");
        }
        String answer = sb.toString();
        return answer.substring(0, answer.length() - 1);
    }
}
