package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1244 {
    private static char[] charArr;
    private static int maxValue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            charArr = st.nextToken().toCharArray();
            int swapCnt = Integer.parseInt(st.nextToken());

            maxValue = Integer.MIN_VALUE;
            dfs(0, swapCnt);

            System.out.printf("#%d %d\n", tc, maxValue);
        }
    }

    private static void dfs(int start, int swapCnt) {
        if (swapCnt == 0) {
            int curVal = Integer.parseInt(new String(charArr));
            maxValue = Math.max(maxValue, curVal);
            return;
        }
        for (int i = start; i < charArr.length - 1; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[j] >= charArr[i]) {
                    swap(i, j);
                    dfs(i, swapCnt - 1);
                    swap(i, j);
                }
            }
        }
    }

    private static void swap(int i, int j) {
        char tmp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = tmp;
    }
}
