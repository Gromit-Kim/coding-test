package programmers.level0;

public class L0_Solution_171 {
    // 그림 확대: https://school.programmers.co.kr/learn/courses/30/lessons/181836
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int ansIdx = 0;
        for (String pic : picture) {
            StringBuilder sb = new StringBuilder();
            for (char ch : pic.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    sb.append(ch);
                }
            }
            for (int i = 0; i < k; i++) {
                answer[ansIdx++] = sb.toString();
            }
        }
        return answer;
    }
}
