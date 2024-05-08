package org.swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1926 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int cnt = check(i);
            if (cnt != 0) {
                for(int j = 0; j < cnt; j++){
                    sb.append("-");
                }
            } else {
                sb.append(i);
            }
            sb.append(" ");
        }
        String result = sb.substring(0, sb.length()-1);
        System.out.println(result);
    }

    private static int check(int n){
        int cnt = 0;
        while(n > 0){
            int cur = n % 10;
            if(cur == 3 || cur == 6 || cur == 9){
                cnt++;
            }
            n /= 10;
        }
        return cnt;
    }

}
