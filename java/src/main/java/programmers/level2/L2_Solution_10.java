package programmers.level2;

public class L2_Solution_10 {
    // 카펫: https://school.programmers.co.kr/learn/courses/30/lessons/42842
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for (int h = 1; h * h <= total; h++) {
            if (total % h == 0) {
                int w = total / h;
                if (2 * (w + h - 2) == brown) {
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            }
        }
        return answer;
    }
}
