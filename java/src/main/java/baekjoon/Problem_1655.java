package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Problem_1655 {
    // 가운데를 말해요: https://www.acmicpc.net/problem/1655
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (minheap.size() == maxheap.size()) {
                maxheap.offer(num);
            } else {
                minheap.offer(num);
            }
            if (!minheap.isEmpty() && !maxheap.isEmpty()) {
                if (minheap.peek() < maxheap.peek()) {
                    int temp = minheap.poll();
                    minheap.offer(maxheap.poll());
                    maxheap.offer(temp);
                }
            }
            sb.append(maxheap.peek()).append("\n");
        }
        System.out.println(sb);
    }
}
