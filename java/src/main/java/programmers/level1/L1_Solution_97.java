package programmers.level1;

public class L1_Solution_97 {
    // PCCE 기출문제 1번 / 붕대감기: https://school.programmers.co.kr/learn/courses/30/lessons/250137?language=java
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int curtime = 0; // 현재 시간
        for (int[] attack : attacks) {
            int attackedTime = attack[0], minus = attack[1];
            int subTime = attackedTime - curtime - 1;
            answer += subTime * bandage[1] + subTime / bandage[0] * bandage[2];
            curtime = attackedTime;
            if (answer > health)
                answer = health;
            if (answer - minus <= 0)
                return -1;
            answer -= minus;
            System.out.println(answer);
        }
        return answer;
    }
}
