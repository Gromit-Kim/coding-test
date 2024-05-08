package org.swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2007 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String totalStr = br.readLine();
            int result = 0;
            for (int j = 0; j < 10; j++) {
                String sub1 = totalStr.substring(0, j + 1);
                String sub2 = totalStr.substring(j + 1, 2 * (j + 1));
                if (sub1.equals(sub2)) {
                    result = j + 1;
                    break;
                }
            }
            System.out.printf("#%d %d\n", i, result);
        }
    }
}
