package programmers.level1;


import java.util.*;

public class L1_Solution_73 {
    // 실패율: https://school.programmers.co.kr/learn/courses/30/lessons/42889
    private static Map<Integer, Integer> map = new HashMap<>();

    public int[] solution(int N, int[] lastStages) {
        for (int stage : lastStages) {
            map.put(stage, map.getOrDefault(stage, 0) + 1);
        }

        List<Stage> stages = new ArrayList<>();
        int totalPlayers = lastStages.length;
        for (int id = 1; id <= N; id++) {
            int reached = map.getOrDefault(id, 0);
            double failureRate = 0.0;

            if (totalPlayers > 0)
                failureRate = (double) reached / totalPlayers;

            totalPlayers -= reached;

            Stage s = new Stage(id, failureRate);
            stages.add(s);
        }
        stages.sort(Collections.reverseOrder());

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stages.get(i).id;
        }
        return answer;
    }

    class Stage implements Comparable<Stage> {
        public int id;
        public double failure;

        public Stage(int id, double failure) {
            this.id = id;
            this.failure = failure;
        }

        @Override
        public int compareTo(Stage o) {
            if (failure < o.failure)
                return -1;
            if (failure > o.failure)
                return 1;
            return 0;
        }
    }
}
