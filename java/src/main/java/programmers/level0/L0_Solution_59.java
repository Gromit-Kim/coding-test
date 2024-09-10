package programmers.level0;

import java.util.stream.IntStream;

public class L0_Solution_59 {
    // 배열의 길이에 따라 다른 연산하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181854
    public int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 0){
            return IntStream.range(0, arr.length)
                    .map(i -> i % 2 == 1 ? arr[i] + n : arr[i])
                    .toArray();
        }
        return IntStream.range(0, arr.length)
                .map(i -> i % 2 == 0 ? arr[i] + n : arr[i])
                .toArray();
    }
}
