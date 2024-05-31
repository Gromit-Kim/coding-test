package programmers;

public class L2_Solution_28 {
    private int answer = -1;
    private boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return answer;
    }

    private void dfs(int d, int k, int[][] dun){
        for(int i = 0; i < dun.length; i++){
            if(!visited[i] && k >= dun[i][0]){
                visited[i] = true;
                dfs(d+1, k- dun[i][1], dun);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, d);
    }
}
