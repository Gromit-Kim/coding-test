package programmers.level0;

public class L0_Solution_185 {
    // 코드 처리하기: https://school.programmers.co.kr/learn/courses/30/lessons/181932
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        boolean isModeZero = true;
        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i) == '1'){
                isModeZero = !isModeZero;
                continue;
            }
            if(isModeZero){
                if(i % 2 == 0){
                    sb.append(code.charAt(i));
                }
            }else{
                if(i%2 == 1){
                    sb.append(code.charAt(i));
                }
            }
        }
        if(sb.toString().isEmpty())
            return "EMPTY";
        return sb.toString();
    }
}
