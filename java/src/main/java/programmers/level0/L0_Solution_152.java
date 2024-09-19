package programmers.level0;

public class L0_Solution_152 {
    // 세 개의 구분자: https://school.programmers.co.kr/learn/courses/30/lessons/181862
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]", " ").replaceAll("\\s+"," ").trim();
        if(myStr.isEmpty())
            return new String[] {"EMPTY"};
        return myStr.split(" ");
    }
}
