package programmers.level0;

public class L0_Solution_172 {
    // 외계어 사전: https://school.programmers.co.kr/learn/courses/30/lessons/120869
    public int solution(String[] spell, String[] dic) {
        for (String item : dic) {
            if (item.length() != spell.length)
                continue;
            for (String ch : spell) {
                item = item.replaceFirst(ch, "");
            }
            if (item.isEmpty())
                return 1;
        }
        return 2;
    }
}
