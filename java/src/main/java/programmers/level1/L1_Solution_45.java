package programmers.level1;

public class L1_Solution_45 {
    // 3진법 뒤집기: https://school.programmers.co.kr/learn/courses/30/lessons/68935
    public int solution(int n) {
        String str = "";
        while (n != 0) {
            str += n % 3;
            n /= 3;
        }
        return Integer.parseInt(str, 3);
    }
}
