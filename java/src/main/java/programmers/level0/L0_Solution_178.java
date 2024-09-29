package programmers.level0;

import java.util.Scanner;

public class L0_Solution_178 {
    // 대소문자 바꿔서 출력하기: https://school.programmers.co.kr/learn/courses/30/lessons/181949
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                sb.append(Character.toLowerCase(ch));
            else
                sb.append(Character.toUpperCase(ch));
        }
        System.out.println(sb.toString());
    }
}
