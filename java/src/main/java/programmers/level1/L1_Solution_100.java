package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class L1_Solution_100 {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> indices = new HashMap<>();
        Info[] infos = new Info[friends.length];

        for (int i = 0; i < infos.length; i++) {
            indices.put(friends[i], i);
            infos[i] = new Info(friends[i], friends);
        }

        for (String gift : gifts) {
            String[] splited = gift.split(" ");
            String from = splited[0], to = splited[1];
            int fromIdx = indices.get(from);
            int toIdx = indices.get(to);
            infos[fromIdx].give(to);   // from이 to에게 선물을 줌
            infos[toIdx].recv(from);   // to는 from으로부터 선물을 받음
        }

        int maxGifts = 0;
        for (int i = 0; i < infos.length; i++) {
            int cnt = 0;
            for (int j = 0; j < infos.length; j++) {
                if (i != j) {
                    cnt += compareAndCalc(infos[i], infos[j]);
                }
            }
            maxGifts = Math.max(maxGifts, cnt);
        }
        return maxGifts;
    }

    private int compareAndCalc(Info i1, Info i2) {
        // 선물 주고받은 횟수 우선 비교
        int i1ToI2Gifts = i1.getGiftsTo(i2.name);
        int i2ToI1Gifts = i2.getGiftsTo(i1.name);

        if (i1ToI2Gifts > i2ToI1Gifts) {
            return 1; // i1이 선물을 받음
        } else if (i1ToI2Gifts < i2ToI1Gifts) {
            return 0; // i2가 선물을 받음
        }

        // 선물 지수 비교
        if (i1.stats > i2.stats) {
            return 1; // i1이 선물을 받음
        } else if (i1.stats < i2.stats) {
            return 0; // i2가 선물을 받음
        }

        return 0; // 동일하면 선물 받지 않음
    }

    class Info {
        public String name;
        public int stats = 0; // 준선물 - 받은 선물
        public Map<String, Integer> map; // 친구들에게 선물 준 기록

        public Info(String name, String[] friends) {
            this.name = name;
            this.map = new HashMap<>(friends.length - 1);
            for (String friend : friends) {
                if (!friend.equals(name)) {
                    map.put(friend, 0);
                }
            }
        }

        public void give(String to) {
            this.stats += 1;
            map.put(to, map.get(to) + 1);
        }

        public void recv(String from) {
            this.stats -= 1;
        }

        public int getGiftsTo(String friend) {
            return map.getOrDefault(friend, 0);
        }

    }


}
