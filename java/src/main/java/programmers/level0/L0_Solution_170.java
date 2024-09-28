package programmers.level0;

public class L0_Solution_170 {
    // 정사각형으로 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/181830
    public int[][] solution(int[][] arr) {
        int row = arr.length, col = arr[0].length;
        int max = Math.max(row, col);

        int[][] answer = new int[max][max];
        for (int i = 0; i < row; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
        }
        return answer;
    }
}
