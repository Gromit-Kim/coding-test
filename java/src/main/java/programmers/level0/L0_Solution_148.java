package programmers.level0;

public class L0_Solution_148 {
    // A로 B 만들기:  https://school.programmers.co.kr/learn/courses/30/lessons/120886
    public int solution(String before, String after) {
        for (String str : before.split("")) {
            after = after.replaceFirst(str, "");
        }
        if (after.isEmpty())
            return 1;
        return 0;
    }
}
