package swea;

import java.io.IOException;
import java.util.Scanner;

public class Solution1989 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 줄바꿈 문자 처리
        for (int tc = 1; tc <= T; tc++) {
            int result = 1; // 회문, 회문이 아니면 0으로
            String inputStr = sc.nextLine();
            int n = inputStr.length() / 2; // 5 /2 -> 2
            for (int i = 0; i < n; i++) {
                if (inputStr.charAt(i) != inputStr.charAt(inputStr.length() - 1 - i)) {
                    result = 0;
                    break;
                }
            }
            System.out.printf("#%d %d\n", tc, result);
        }
    }

}
