package programmers.level0;

public class L0_Solution_108 {
    // 짝수 홀수 개수 : https://school.programmers.co.kr/learn/courses/30/lessons/120824
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0] += 1;
            } else {
                answer[0] += 1;
            }
        }
        return answer;
    }
}
