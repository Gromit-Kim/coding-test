package programmers.level0;

public class L0_Solution_196 {
    // 옹알이(1): https://school.programmers.co.kr/learn/courses/30/lessons/120956
    public int solution(String[] babbling) {
        String[] can_speak = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(String b : babbling){
            String s = b;
            for(String can : can_speak){
                s = s.replace(can, " ");
            }
            if(s.trim().equals("")){
                answer += 1;
            }
        }
        return answer;
    }
}
