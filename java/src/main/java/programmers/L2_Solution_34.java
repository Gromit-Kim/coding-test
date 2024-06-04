package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L2_Solution_34 {
    // [3차] 압축 :
    private static Map<String, Integer> map = new HashMap<>();

    static {
        for (int i = 0; i < 26; i++)
            map.put(String.valueOf((char) ('A' + i)), i + 1);
    }

    public int[] solution(String msg) {
        List<Integer> lst = new ArrayList<>();
        int last = 26;

        int i = 0; // msg에서 word의 시작점
        while (i < msg.length()) {
            String w = "";
            int index = 0; // 색인번호

            // 가장 긴 단어 찾기
            for (int j = i; j < msg.length(); j++) {
                String c = String.valueOf(msg.charAt(j));
                if (map.containsKey(w + c)) {
                    w += c; // 가장 긴 단어 만들고
                    index = map.get(w); // 색인번호 업데이트
                    i = j; // start 업데이트
                } else {
                    break; // 없는 단어 발견
                }
            }

            if (i < msg.length() - 1) // i가 끝이 아닐 때만
                map.put(w + msg.charAt(i + 1), ++last); // 새로운 색인번호 등록

            lst.add(index); // 없는 단어 직전의 있는 단어의 색인번호
            i++;
        }

        return lst.stream().mapToInt(a -> a).toArray();
    }
}
