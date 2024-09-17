package programmers.level0;

public class L0_Solution_134 {
    // 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기: https://school.programmers.co.kr/learn/courses/30/lessons/181872
    public String solution(String myString, String pat) {
        int index = myString.lastIndexOf(pat);
        return myString.substring(0, index) + pat;
    }
}
