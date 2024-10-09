package programmers.level1;

public class L1_Solution_79 {
    // 문자열 나누기: https://school.programmers.co.kr/learn/courses/30/lessons/140108
    public int solution(String s) {
        int answer = 0;

        char x = s.charAt(0);
        int xCnt = 0, nonXCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == x) {
                xCnt++;
            } else {
                nonXCnt++;
            }

            if (xCnt == nonXCnt) {
                answer++;
                xCnt = 0;
                nonXCnt = 0;
                if (i + 1 < s.length())
                    x = s.charAt(i + 1);
            }
        }
        if (xCnt != 0 || nonXCnt != 0)
            answer++;
        return answer;
    }
}
