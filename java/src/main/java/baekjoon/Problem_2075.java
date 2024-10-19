package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Problem_2075 {
    // n 번째 큰 수: https://www.acmicpc.net/problem/2075
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minq = new PriorityQueue<>(n);

        for (int t = 0; t < n; t++) {
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(input[i]);
                if (minq.size() < n) {
                    minq.offer(num);
                } else if (minq.peek() < num) {
                    minq.poll();
                    minq.offer(num);
                }
            }
        }
        System.out.println(minq.peek());
    }
}
