package programmers.level2;

public class L2_Solution_21 {
    // n^2 배열 자르기: https://school.programmers.co.kr/learn/courses/30/lessons/87390
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        for(long i = left; i <= right; i++){
            int row = (int)(i / n);
            int col = (int)(i % n);
            answer[(int)(i-left)] = Math.max(row, col) + 1;
        }
        return answer;
    }
}
