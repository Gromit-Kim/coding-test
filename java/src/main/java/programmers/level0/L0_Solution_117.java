package programmers.level0;

public class L0_Solution_117 {
    // 간단한 식 계산하기: https://school.programmers.co.kr/learn/courses/30/lessons/181865
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");

        int num1 = Integer.parseInt(arr[0]);
        String op = arr[1];
        int num2 = Integer.parseInt(arr[2]);

        if(op.equals("+")){
            return num1 + num2;
        }
        if(op.equals("-")){
            return num1 - num2;
        }
        return num1 * num2;
    }
}
