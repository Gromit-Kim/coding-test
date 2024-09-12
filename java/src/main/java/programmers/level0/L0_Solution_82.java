package programmers.level0;

import java.util.Scanner;

public class L0_Solution_82 {
    // 직각삼각형 출력하기: https://school.programmers.co.kr/learn/courses/30/lessons/120823
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.println("*".repeat(i));
    }
}
