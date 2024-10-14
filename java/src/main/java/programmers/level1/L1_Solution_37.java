package programmers.level1;

public class L1_Solution_37 {
    // 문자열 다루기 기본: https://school.programmers.co.kr/learn/courses/30/lessons/12918
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6)
            return false;
        for(char ch : s.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
}
