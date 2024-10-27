package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L2_Solution_46 {
    private HashMap<String, String> map = new HashMap<>();

    public String[] solution(String[] record) {
        List<String> lst = new ArrayList<>();

        for (String rec : record) {
            String[] infos = rec.split(" ");
            String cmd = infos[0], id = infos[1];
            String nickname = infos.length > 2 ? infos[2] : "";
            if (cmd.equals("Enter")) {
                lst.add(id + "님이 들어왔습니다.");
                map.put(id, nickname);
            } else if (cmd.equals("Leave")) {
                lst.add(id + "님이 나갔습니다.");
            } else {
                map.put(id, nickname);
            }
        }
        String[] result = new String[lst.size()];
        int idx = 0;
        for (String msg : lst) {
            String[] parts = msg.split("님");
            String id = parts[0], action = parts[1];
            result[idx++] = map.get(id) + "님" + action;
        }
        return result;
    }
}
