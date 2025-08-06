package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main312246 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] ms = new int [n];
        int[] bs = new int [n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ms[i] = a;
            bs[i] = b;
        }

        int start = 0;
        int end = 1_000_000_001;
        int result = end;

        while(start <= end){
            int mid = (start + end) / 2;
            int cnt = 0;
            for(int i = 0; i < n; i++){
                if(ms[i] + mid >= bs[i]){
                    cnt++;
                }
            }
            if(cnt >= k){
                result = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        System.out.println(result);

        br.close();
    }
    
}
