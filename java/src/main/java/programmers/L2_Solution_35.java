package programmers;

public class L2_Solution_35 {
    // n 진수 게임 : https://school.programmers.co.kr/learn/courses/30/lessons/17687

    public String solution(int n, int t, int m, int p) {
        String concatNumber = "";
        int i = 0;
        while (concatNumber.length() < t * m) {
            concatNumber += Integer.toString(i++, n).toUpperCase(); // i를 n진법으로 바꿔서
        }

        String answer = "";
        for (int step = 0; step < t; step++) {
            answer += String.valueOf(concatNumber.charAt(step * m + (p - 1)));
        }
        return answer;
    }
}
