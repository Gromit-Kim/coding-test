package programmers.level2;

public class L2_Solution_59 {
    // 연속된 부분 수열의 합: https://school.programmers.co.kr/learn/courses/30/lessons/178870
    public int[] solution(int[] sequence, int k) {
        int start = 0, end = 0, sum = 0;
        int minLength = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (end < sequence.length) {
            sum += sequence[end];

            while (sum >= k) {
                if (sum == k) {
                    int length = end - start + 1;
                    if (length < minLength) {
                        minLength = length;
                        result[0] = start;
                        result[1] = end;
                    }
                }
                sum -= sequence[start];
                start++;
            }
            end++;
        }

        return result;
    }
}
