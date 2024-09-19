package programmers.level0;

public class L0_Solution_155 {
    // 컨트롤 제트: https://school.programmers.co.kr/learn/courses/30/lessons/120853
    public int solution(String s) {
        String[] splited = s.split(" ");
        int answer = 0;
        for(int i = 0; i < splited.length; i++){
            if(splited[i].equals("Z")){
                answer -= Integer.parseInt(splited[i-1]);
            }else{
                answer += Integer.parseInt(splited[i]);
            }
        }
        return answer;
    }
}
