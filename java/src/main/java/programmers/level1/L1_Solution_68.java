package programmers.level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class L1_Solution_68 {
    // 모의고사: https://school.programmers.co.kr/learn/courses/30/lessons/42840
    public int[] solution(int[] answers) {
        int[] one = new int[] {1, 2, 3, 4, 5};
        int[] two = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] counts = new int[3];
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == one[i % one.length]){
                counts[0]++;
            }
            if(answers[i] == two[i % two.length]){
                counts[1]++;
            }
            if(answers[i] == three[i % three.length]){
                counts[2]++;
            }
        }
        int maxCnt = Arrays.stream(counts).max().orElse(counts[0]);
        return IntStream.range(0, 3).filter(i -> counts[i] == maxCnt)
                .map(i -> i + 1).toArray();
    }
}
