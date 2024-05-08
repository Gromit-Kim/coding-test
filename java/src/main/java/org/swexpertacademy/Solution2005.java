package org.swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2005 {
    private static int[][] DP = new int[10][10];

    public static void main(String[] args) throws IOException {
        DP[0][0] = DP[1][0] = DP[1][1] = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());
            initDP(n);
            StringBuilder sb = new StringBuilder();
            System.out.printf("#%d\n", tc);
            for (int i = 0; i < n; i++) {
                for(int j = 0; j <= i; j++){
                    sb.append(DP[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
        }
    }

    private static void initDP(int n) {
        for (int i = 2; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (DP[i][j] != 0) {
                    continue;
                }
                if (j == 0 || i == j) {
                    DP[i][j] = 1;
                } else {
                    DP[i][j] = DP[i - 1][j - 1] + DP[i - 1][j];
                }
            }
        }
    }
}