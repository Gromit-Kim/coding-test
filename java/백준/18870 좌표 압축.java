import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] sortedArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            arr[i] = sortedArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> rankMap = new HashMap();
        int rank = 0;
        for(int value : sortedArr){
            if(!rankMap.containsKey(value)){
                rankMap.put(value, rank++);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int value : arr){
            sb.append(rankMap.get(value)).append(" ");
        }
        System.out.println(sb);
    }
}