package programmers;

public class L2_Solution_5 {
    public int[] solution(String s) {
        int cnt = 0;
        int zeroCnt = 0;
        while (!s.equals("1")) {
            cnt++;
            int before = s.length();
            s = s.replace("0", "");
            zeroCnt += before - s.length(); // 0의 수
            s = Integer.toBinaryString(s.length());
        }
        return new int[]{cnt, zeroCnt};
    }
}
