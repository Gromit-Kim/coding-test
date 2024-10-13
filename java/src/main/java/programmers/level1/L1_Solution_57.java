package programmers.level1;

public class L1_Solution_57 {
    // 푸드 파이트 대회: https://school.programmers.co.kr/learn/courses/30/lessons/134240
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int cnt = food[i] % 2 == 0 ? food[i] / 2 : (food[i] - 1) / 2;
            sb.append(String.valueOf(i).repeat(cnt));
        }
        return sb.toString() + 0 + sb.reverse().toString();
    }
}
