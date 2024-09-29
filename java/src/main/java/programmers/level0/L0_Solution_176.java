package programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class L0_Solution_176 {
    // 로그인 성공? : https://school.programmers.co.kr/learn/courses/30/lessons/120883
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> map = new HashMap<String, String>();
        for (String[] item : db) {
            map.put(item[0], item[1]);
        }
        if (!map.containsKey(id_pw[0]))
            return "fail";
        if (map.get(id_pw[0]).equals(id_pw[1]))
            return "login";
        return "wrong pw";
    }
}
