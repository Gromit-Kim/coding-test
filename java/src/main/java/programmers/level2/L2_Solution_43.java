package programmers.level2;

public class L2_Solution_43 {
    // 스킬트리: https://school.programmers.co.kr/learn/courses/30/lessons/49993
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skill_tree : skill_trees) {
            String sub = skill_tree.replaceAll("[^" + skill + "]", "");
            if (skill.startsWith(sub)) {
                answer++;
            }
        }
        return answer;
    }
}
