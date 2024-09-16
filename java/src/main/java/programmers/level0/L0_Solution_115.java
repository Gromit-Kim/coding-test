package programmers.level0;

public class L0_Solution_115 {
    // 숫차 찾기: https://school.programmers.co.kr/learn/courses/30/lessons/120904?language=java
    public int solution(int num, int k){
        String numStr = num + "";
        String kStr = k + "";
        if(!numStr.contains(kStr))
            return -1;
        return numStr.indexOf(kStr) + 1;
    }
}
