package programmers.level2;

public class L2_Solution_4 {
    // JadenCase 문자열 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/12951
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for(String str : s.split(" ", -1)){
            if(!str.isEmpty()){
                String sub1 = str.substring(0, 1).toUpperCase();
                String sub2 = str.substring(1).toLowerCase();
                sb.append(sub1).append(sub2);
            }
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
