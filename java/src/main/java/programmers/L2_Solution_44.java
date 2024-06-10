package programmers;

public class L2_Solution_44 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String s : skill_trees) {
            int idx = 0;
            boolean isValid = true;
            for (char ch : s.toCharArray()) {
                if (skill.contains(String.valueOf(ch))) {
                    if (ch == skill.charAt(idx)) {
                        idx++;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid)
                answer++;
        }
        return answer;
    }
}
