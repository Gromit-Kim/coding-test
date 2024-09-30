package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_183 {
    // 배열 만들기 2: https://school.programmers.co.kr/learn/courses/30/lessons/181921
    public int[] solution(int l, int r) {
        int[] answer = IntStream.rangeClosed(l, r)
                .filter(this::check)
                .toArray();
        if(answer.length == 0)
            return new int[] {-1};
        return answer;
    }

    private boolean check(int num){
        while(num > 0){
            if(num % 10 != 5 && num % 10 != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
