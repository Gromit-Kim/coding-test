package org.swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1983 {

    private static final String[] GRADES = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0",
        "A+"};

    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(sb.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(sb.readLine());
            int n = Integer.parseInt(st.nextToken()); // 사람 수
            int k = Integer.parseInt(st.nextToken()); // k번째

            double[] scores = new double[n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(sb.readLine());
                int midterm = Integer.parseInt(st.nextToken());
                int finalterm = Integer.parseInt(st.nextToken());
                int homework = Integer.parseInt(st.nextToken());
                scores[i] = midterm * 0.35 + finalterm * 0.45 + homework * 0.2;
            }
            double goal = scores[k - 1];
            Arrays.sort(scores);
            int k_grade = -1;
            for (int i = 0; i < n; i++) {
                if (goal == scores[i]) {
                    k_grade = i;
                    break;
                }
            }

            System.out.printf("#%d %s\n", tc, GRADES[k_grade/(n/10)]);
        }
    }
}
