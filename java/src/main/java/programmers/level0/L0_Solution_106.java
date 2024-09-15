package programmers.level0;

public class L0_Solution_106 {
    public String solution(String cipher, int code){
        // 암호 해독 : https://school.programmers.co.kr/learn/courses/30/lessons/120892
        StringBuilder sb = new StringBuilder();
        for(int i = code-1; i < cipher.length(); i+= code){
            sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}
