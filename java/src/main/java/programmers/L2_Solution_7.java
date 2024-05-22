package programmers;

public class L2_Solution_7 {
    public int solution(int n) {
        String num = Integer.toBinaryString(n);
        int oneCnt = num.length() - num.replace("1", "").length();
        int next = n + 1;
        while (true) {
            String nextStr = Integer.toBinaryString(next);
            int cnt = nextStr.length() - nextStr.replace("1", "").length();
            if (oneCnt == cnt) {
                break;
            }
            next++;
        }
        return next;
    }
}
