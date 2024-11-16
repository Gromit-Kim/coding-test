package programmers.level2;

public class L2_Solution_55 {
    // 쿼드 압축 후 개수 세기: https://school.programmers.co.kr/learn/courses/30/lessons/68936
    private static final int[] answer = new int[2];

    public int[] solution(int[][] arr) {
        quad(arr, 0, 0, arr.length);
        return answer;
    }

    private boolean zip(int[][] arr, int sx, int sy, int size, int val){
        for(int i = sx; i < sx + size; i++){
            for(int j = sy; j < sy + size; j++){
                if(arr[i][j] != val){
                    return false;
                }
            }
        }
        return true;
    }

    private void quad(int[][] arr, int sx, int sy, int size){
        if(zip(arr, sx, sy, size, arr[sx][sy])){
            if(arr[sx][sy] == 1){
                answer[1]++;
                return;
            }
            answer[0]++;
            return;
        }
        quad(arr, sx, sy, size/2);
        quad(arr, sx, sy + size/2, size/2);
        quad(arr, sx+size/2, sy, size/2);
        quad(arr, sx+size/2, sy+size/2, size/2);
    }
}
