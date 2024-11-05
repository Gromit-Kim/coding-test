package programmers.level2;

public class L2_Solution_51 {
    // 2개 이하로 다른 비트: https://school.programmers.co.kr/learn/courses/30/lessons/77885
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            long number = numbers[i];
            if (number % 2 == 0) {
                answer[i] = number + 1;
                continue;
            }
            // 오른쪽부터 가장 낮은 위치의 0 비트를 1로 바꾸고
            // 그 다음 비트를 0으로 바꿔서 최소 2비트 차이 값을 만든다.
            long lowestZeroBit = (~number) & (number + 1); // 가장 낮은 위치의 0 비트 찾기
            answer[i] = number + lowestZeroBit - (lowestZeroBit >> 1);
        }
        return answer;
    }
}
