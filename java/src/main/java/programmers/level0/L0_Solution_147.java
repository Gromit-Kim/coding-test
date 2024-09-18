package programmers.level0;

public class L0_Solution_147 {
    // 숨어있는 숫자의 덧셈(2) : https://school.programmers.co.kr/learn/courses/30/lessons/120864
    public int solution(String my_string){
        int answer = 0;
        StringBuilder sb = new StringBuilder("0");
        for(char ch : my_string.toCharArray()){
            if(Character.isDigit(ch)){
                sb.append(ch);
            }else{
                answer += Integer.parseInt(sb.toString());
                sb.setLength(0);
                sb.append("0");
            }
        }
        return answer + Integer.parseInt(sb.toString());
    }
}
