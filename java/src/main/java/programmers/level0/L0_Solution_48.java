package programmers.level0;

import java.util.Scanner;

public class L0_Solution_48 {
    // 홀짝 구분하기:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println(n +" is even");
            return;
        }
        System.out.println(n + " is odd");
    }
}
