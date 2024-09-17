package programmers.level0;

public class L0_Solution_132 {
    // 날짜 비교하기: https://school.programmers.co.kr/learn/courses/30/lessons/181838
    public int solution(int[] date1, int[] date2) {
        for(int i = 0; i < 3; i++){
            if(date1[i] < date2[i])
                return 1;
            if(date1[i] > date2[i])
                return 0;
        }
        return 0;
    }
}
