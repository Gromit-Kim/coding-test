package org.swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1859 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] prices = new long[n];
            for (int j = 0; j < n; j++) {
                prices[j] = Integer.parseInt(st.nextToken());
            }

            long max_price = 0;
            long profit = 0;
            for(int j = n-1; j >= 0; j--){
                if(prices[j] > max_price)
                    max_price = prices[j];
                else
                    profit += max_price - prices[j];
            }
            System.out.printf("#%d %d\n", i, profit);
        }
    }
}
