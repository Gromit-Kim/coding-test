package programmers.level0;

public class L0_Solution_144 {
    // 수열과 구간 쿼리 1: https://school.programmers.co.kr/learn/courses/30/lessons/181883
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            for(int i = s; i <= e; i++){
                arr[i] += 1;
            }
        }
        return arr;
    }
}
