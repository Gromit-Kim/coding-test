package programmers.level2;

public class L2_Solution_7 {
    // 다음 큰 숫자: https://school.programmers.co.kr/learn/courses/30/lessons/12911
    public int solution(int n) {
        int answer = n+1;
        String binaryN = Integer.toBinaryString(n).replace("0","");
        while(!binaryN.equals(Integer.toBinaryString(answer).replace("0",""))){
            answer++;
        }
        return answer;
    }
}
