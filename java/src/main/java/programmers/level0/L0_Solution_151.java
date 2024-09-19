package programmers.level0;

public class L0_Solution_151 {
    // 수열과 구간 쿼리 3: https://school.programmers.co.kr/learn/courses/30/lessons/181924
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query: queries){
            int i = query[0];
            int j = query[1];

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }
}
