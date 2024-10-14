package programmers.level1;

public class L1_Solution_15 {
    // 콜라츠 추측: https://school.programmers.co.kr/learn/courses/30/lessons/12943
    public int solution(int num) {
        if (num == 1)
            return 0;
        long n = (long) num;
        for (int cnt = 1; cnt <= 500; cnt++) {
            if (n % 2 == 0)
                n /= 2;
            else n = n * 3 + 1;
            if (n == 1)
                return cnt;
        }
        return -1;
    }
}
