package programmers.level1;

public class L1_Solution_46 {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i < t.length() - p.length() + 1; i++){
            String sub = t.substring(i, i + p.length());
            long subInt = Long.parseLong(sub);
            if(subInt <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}
