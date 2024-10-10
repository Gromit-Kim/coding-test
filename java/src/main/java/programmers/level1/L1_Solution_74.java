package programmers.level1;

public class L1_Solution_74 {
    // 옹알이(2): https://school.programmers.co.kr/learn/courses/30/lessons/133499
    private static String[] can = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;
        for (String b : babbling) {
            String cur = b;
            for (String c : can) {
                cur = cur.replaceFirst(c, " ");
            }
            if (cur.trim().equals("")) {
                answer++;
            }
        }
        return answer;
    }
}
