package programmers.level1;

public class L1_Solution_61 {
    // [1차] 비밀지도: https://school.programmers.co.kr/learn/courses/30/lessons/17681
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int tmp = arr1[i] | arr2[i];
            int m = n;
            while (m != 0) {
                sb.insert(0, (tmp % 2) == 1 ? '#' : ' ');
                tmp >>= 1;
                m--;
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}
