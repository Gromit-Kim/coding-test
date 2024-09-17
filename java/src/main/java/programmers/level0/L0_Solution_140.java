package programmers.level0;

public class L0_Solution_140 {
    // 배열의 길이를 2의 거듭제곱으로 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/181857
    public int[] solution(int[] arr) {
        int n = 0;
        int target = 1;
        while(target < arr.length){
            target = (int) Math.pow(2,n++);
        }
        int[] answer = new int[target];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }
}
