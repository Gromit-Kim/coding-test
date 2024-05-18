package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;
        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine()); //건물의 수
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] buildings = new int[n];
            for (int i = 0; i < n; i++) {
                buildings[i] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            for (int i = 2; i < n - 2; i++) {
                int leftMax = Math.max(buildings[i - 1], buildings[i - 2]);
                int rightMax = Math.max(buildings[i + 1], buildings[i + 2]);
                int m = Math.max(leftMax, rightMax);
                if (buildings[i] - m > 0) {
                    cnt += buildings[i] - m;
                }
            }
            System.out.printf("#%d %d\n", tc, cnt);
        }
    }

}
