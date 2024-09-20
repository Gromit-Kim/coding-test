package programmers.level2;

public class L2_Solution_5 {
    // 이진 변환 반복하기: https://school.programmers.co.kr/learn/courses/30/lessons/70129
    public int[] solution(String s) {
        // 이진 변환 횟수, 과정에서 제거된 모든 0의 수
        int[] answer = new int[2];
        while(!s.equals("1")){
            answer[0]++;
            answer[1] += (int) s.chars().filter(ch -> ch == '0').count();
            s = s.replace("0","");
            s = Integer.toBinaryString(s.length());
        }
        return answer;
    }
}
