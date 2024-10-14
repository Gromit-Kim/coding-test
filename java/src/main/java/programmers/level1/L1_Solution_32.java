package programmers.level1;

public class L1_Solution_32 {
    // 가운데 글자 가져오기: https://school.programmers.co.kr/learn/courses/30/lessons/12903
    public String solution(String s) {
        int mid = s.length() / 2;
        if(s.length() % 2 == 0){
            return s.substring(mid-1, mid+1);
        }
        return s.charAt(mid) + "";
    }
}
