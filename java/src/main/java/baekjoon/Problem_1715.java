package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Problem_1715 {
    // 카드 정렬하기: https://www.acmicpc.net/problem/1715
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> minq = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());
        for (int t = 0; t < n; t++) {
            int num = Integer.parseInt(br.readLine());
            minq.offer(num);
        }
        int answer = 0;
        while (minq.size() > 1) {
            int first = minq.poll();
            int second = minq.poll();
            int sum = first + second;
            answer += sum;
            minq.offer(sum);
        }
        System.out.println(answer);
    }
}
