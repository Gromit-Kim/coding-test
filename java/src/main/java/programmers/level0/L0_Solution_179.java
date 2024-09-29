package programmers.level0;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class L0_Solution_179 {
    // 등수매기기 : https://school.programmers.co.kr/learn/courses/30/lessons/120882
    public int[] solution(int[][] score) {
        List<Integer> lst = new ArrayList<>();
        for (int[] s : score) {
            lst.add(s[0] + s[1]);
        }
        lst.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            answer[i] = lst.indexOf(score[i][0] + score[i][1]) + 1;
        }

        return answer;
    }
}
