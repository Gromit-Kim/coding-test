package programmers.level1;

public class L1_Solution_48 {
    private static int ANS = 0;

    public int solution(int[] number) {
        dfs(0, number, new int[3], 0);
        return ANS;
    }

    private void dfs(int depth, int[] number, int[] res, int start){
        if(depth == 3){
            if(res[0] + res[1] + res[2] == 0){
                ANS++;
            }
            return;
        }
        for(int i = start; i < number.length; i++){
            res[depth] = number[i];
            dfs(depth+1, number, res, i+1);
        }
    }
}
