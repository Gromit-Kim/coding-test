package programmers.level0;

public class L0_Solution_187 {
    // OX퀴즈
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i = 0;
        for(String q : quiz){
            String[] splited = q.split(" ");
            int n1 = Integer.parseInt(splited[0]);
            String op = splited[1];
            int n2 = Integer.parseInt(splited[2]);
            int res = Integer.parseInt(splited[4]);

            if(op.equals("-")){
                if(res == n1 - n2){
                    answer[i++] = "O";
                }else{
                    answer[i++] = "X";
                }
            }else if(op.equals("+")){
                if(res == n1 + n2){
                    answer[i++] = "O";
                }else{
                    answer[i++] = "X";
                }
            }
        }
        return answer;
    }
}
