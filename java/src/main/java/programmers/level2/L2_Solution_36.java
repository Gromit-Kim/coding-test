package programmers.level2;

public class L2_Solution_36 {
    // 모음사전: https://school.programmers.co.kr/learn/courses/30/lessons/84512
    private static final char[] dic = new char[]{'A', 'E', 'I', 'O', 'U'};
    private int ans = 0;

    public int solution(String word) {
        dfs(new StringBuilder(), word);
        return ans;
    }

    private boolean dfs(StringBuilder sb, String target) {
        if (sb.toString().equals(target)) {
            return true;
        }
        if (sb.length() >= 5) {
            return false;
        }
        for (int i = 0; i < dic.length; i++) {
            sb.append(dic[i]);
            ans++;
            if (dfs(sb, target)) {
                return true;
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return false;
    }
}
