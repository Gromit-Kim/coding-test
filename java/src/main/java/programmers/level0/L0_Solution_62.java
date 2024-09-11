package programmers.level0;

import java.util.Arrays;

public class L0_Solution_62 {
    // 뒤에서 5등 위로 : https://school.programmers.co.kr/learn/challenges?order=acceptance_desc&languages=java&page=4&levels=0
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}
