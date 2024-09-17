package programmers.level0;

public class L0_Solution_141 {
    // 1로 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/181880
    public int solution(int[] num_list) {
        int answer = 0;
        for(int num : num_list){
            answer += count(num);
        }
        return answer;
    }

    private int count(int num){
        int cnt = 0;
        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }else{
                num = (num - 1) / 2;
            }
            cnt++;
        }
        return cnt;
    }
}
