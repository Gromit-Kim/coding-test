package programmers.level0;

public class L0_Solution_188 {
    // 다음에 올 숫자
    public int solution(int[] common) {
        if(common[2] - common[1] == common[1] - common[0]){
            return common[0] + common.length*(common[2] - common[1]);
        }else{
            int r = common[1] / common[0];
            return common[0] * (int) Math.pow(r, common.length);
        }

    }
}
