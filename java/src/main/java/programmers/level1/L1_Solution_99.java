package programmers.level1;

import java.util.Arrays;

public class L1_Solution_99 {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        for (int i = mats.length - 1; i >= 0; i--) {
            int n = mats[i];
            int maxRow = park.length - n;
            int maxCol = park[0].length - n;
            for (int startRow = 0; startRow <= maxRow; startRow++) {
                for (int startCol = 0; startCol <= maxCol; startCol++) {
                    if (isOk(park, startRow, startCol, n)) {
                        return n;
                    }
                }
            }
        }
        return -1;
    }

    private boolean isOk(String[][] park, int sRow, int sCol, int n) {
        for (int row = sRow; row < sRow + n; row++) {
            for (int col = sCol; col < sCol + n; col++) {
                if (!park[row][col].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}
