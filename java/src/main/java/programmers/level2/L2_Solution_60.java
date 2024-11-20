package programmers.level2;

public class L2_Solution_60 {
    // 프로그래머스 L2 - 마법의 엘리베이터 , 4page
    public int solution(int storey) {
        int answer = 0;
        while(storey != 0){
            int digit = storey % 10;

            if(digit < 5){
                answer += digit;
            }else if(digit > 5) {
                answer += 10 - digit;
                storey += 10 - digit;
            }else{
                int next = (storey / 10) % 10;
                if(next + 1 > 5){ // 올림한 것이 5보다 크면
                    answer += digit;
                    storey += digit; // 흠;;
                }else{
                    answer += 10 - digit;
                    storey -= digit;
                }
            }
            storey /= 10;
        }
        return answer;
    }
}
