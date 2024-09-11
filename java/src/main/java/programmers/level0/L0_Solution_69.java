package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class L0_Solution_69 {
    // 콜라츠 수열 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/181919
    public int[] solution(int n) {
        List<Integer> lst = new ArrayList<>();
        lst.add(n);
        while(n != 1){
            if(n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
            lst.add(n);
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}
