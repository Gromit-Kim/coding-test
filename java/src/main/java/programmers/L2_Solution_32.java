package programmers;

public class L2_Solution_32 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/92335
    public int solution(int n, int k) {
        int answer = 0;
        // 1. N진법으로 변환
        String numStr = "";
        while (n != 0) {
            numStr = n % k + numStr;
            n /= k;
        }

        for (String data : numStr.split("0")) {
            if (!data.isEmpty() && isPrime(Long.parseLong(data))) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isPrime(long n) {
        if (n < 2)
            return false;
        for (int i = 2; (long) i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
