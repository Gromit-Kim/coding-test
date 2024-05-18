package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1208 {
    private static int[] boxs = new int[100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int tc = 1; tc <= 10; tc++) {
            int result = 0; // 최고점과 최저점의 높이 차이

            int dumpCnt = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 100; i++) {
                boxs[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(boxs);
            for(int i = 0; i < dumpCnt; i++){
                boxs[99]--;
                boxs[0]++;
                Arrays.sort(boxs);
            }
            result = boxs[99] - boxs[0];
            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
