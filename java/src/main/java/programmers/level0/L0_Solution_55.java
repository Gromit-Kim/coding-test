package programmers.level0;

public class L0_Solution_55 {
    // 홀수 vs 짝수: https://school.programmers.co.kr/learn/courses/30/lessons/181887
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for(int i = 0; i < num_list.length; i++){
            if((i + 1) % 2 == 0){
                even += num_list[i];
            }else{
                odd += num_list[i];
            }
        }
        return Math.max(odd, even);
    }
}
