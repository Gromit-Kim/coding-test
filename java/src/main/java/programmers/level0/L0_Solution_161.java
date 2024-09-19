package programmers.level0;

public class L0_Solution_161 {
    // 문자 개수 세기: https://school.programmers.co.kr/learn/courses/30/lessons/181902
    public int[] solution(String my_string){
        int[] answer = new int[52];
        for(char ch : my_string.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                answer[ch - 'a' + 26]++;
            }else{
                answer[ch - 'A']++;
            }
        }
        return answer;
    }
}
