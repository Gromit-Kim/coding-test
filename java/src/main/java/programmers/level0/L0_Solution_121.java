package programmers.level0;

public class L0_Solution_121 {
    // 특별한 이차원 배열 2: https://school.programmers.co.kr/learn/courses/30/lessons/181831
    public int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i])
                    return 0;
            }
        }
        return 1;
    }
}
