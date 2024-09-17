package programmers.level0;

public class L0_Solution_139 {
    // 문자열이 몇 번 등장하는지 세기: https://school.programmers.co.kr/learn/courses/30/lessons/181871
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i <= myString.length() - pat.length(); i++){
            String sub = myString.substring(i, i + pat.length());
            if(sub.equals(pat))
                answer++;
        }
        return answer;
    }
}
