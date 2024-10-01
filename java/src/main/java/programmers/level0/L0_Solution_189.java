package programmers.level0;

public class L0_Solution_189 {
    // 연속된 수의 합: https://school.programmers.co.kr/learn/courses/30/lessons/120923
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total / num + (1 - num) / 2;
        for(int i = 0; i < num; i++){
            answer[i] = start++;
        }
        return answer;
    }
}
