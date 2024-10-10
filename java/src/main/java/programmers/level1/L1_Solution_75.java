package programmers.level1;

import java.util.Arrays;

public class L1_Solution_75 {
    // PCCE 기출문제 9번 / 지폐접기: https://school.programmers.co.kr/learn/courses/30/lessons/340199
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while (!isRight(wallet, bill)) {
            answer++;
            Arrays.sort(bill);
            bill[1] /= 2;
        }
        return answer;
    }

    private boolean isRight(int[] wallet, int[] bill) {
        if (wallet[0] >= bill[0] && wallet[1] >= bill[1]) {
            return true;
        }
        if (wallet[1] >= bill[0] && wallet[0] >= bill[1]) {
            return true;
        }
        return false;
    }
}
