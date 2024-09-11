package programmers.level0;

public class L0_Solution_81 {
    // 주사위의 개수: https://school.programmers.co.kr/learn/courses/30/lessons/120845
    public int solution(int[] box, int n){
        int a = (int)(box[0] / n);
        int b = (int)(box[1] / n);
        int c = (int)(box[2] / n);
        return a*b*c;
    }
}
