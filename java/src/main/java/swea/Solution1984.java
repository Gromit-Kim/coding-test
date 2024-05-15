package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1984 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int total = 0, maxNum = -1, minNum = 10001;
            for (int i = 0; i < 10; i++) {
                int cur = Integer.parseInt(st.nextToken());
                maxNum = Math.max(maxNum, cur);
                minNum = Math.min(minNum, cur);
                total += cur;
            }

            double avg = (total - minNum - maxNum) / 8.0;
            int roundedAvg = (int) Math.round(avg);
            System.out.printf("#%d %d\n", tc, roundedAvg);
        }
    }

}
