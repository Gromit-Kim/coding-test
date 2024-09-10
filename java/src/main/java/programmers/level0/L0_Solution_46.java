package programmers.level0;

public class L0_Solution_46 {
    // 더 크게 합치기: https://school.programmers.co.kr/learn/courses/30/lessons/181939?language=java
    public int solution(int a, int b){
        return Math.max(concat(a, b), concat(b, a));
    }
    private int concat(int a, int b){
        return Integer.parseInt(a + "" + b);
    }
}
