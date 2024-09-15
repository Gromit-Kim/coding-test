package programmers.level0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L0_Solution_105 {
    // 배열의 유사도: https://school.programmers.co.kr/learn/courses/30/lessons/120903
    public int solution(String[] s1, String[] s2){
        List<String> lst = new ArrayList<>(List.of(s1));
        lst.addAll(List.of(s2));
        Set<String> set = new HashSet<>(lst);
        return s1.length + s2.length - set.size();
    }
}
