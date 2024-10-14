package programmers.level1;

public class L1_Solution_9 {
    public int[] solution(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int i = 0;
        while (n > 0) {
            answer[i++] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}
