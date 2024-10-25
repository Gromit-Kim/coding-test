package programmers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L2_Solution_44 {
    // 주차 요금 계산: https://school.programmers.co.kr/learn/courses/30/lessons/92341
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inTime = new HashMap<>();
        Map<String, Integer> totalTime = new HashMap<>();

        for (String record : records) {
            String[] r = record.split(" ");
            String time = r[0], carId = r[1], status = r[2];
            int min = toMin(time);
            if (status.equals("IN")) {
                inTime.put(carId, min);
            }
            if (status.equals("OUT")) {
                int inTimeMin = inTime.remove(carId);
                int parkingTime = min - inTimeMin;
                totalTime.put(carId, parkingTime + totalTime.getOrDefault(carId, 0));
            }
        }

        for (String car : inTime.keySet()) {
            int parkingTime = toMin("23:59") - inTime.get(car);
            totalTime.put(car, totalTime.getOrDefault(car, 0) + parkingTime);
        }

        return totalTime.keySet().stream()
                .sorted()
                .mapToInt(carId -> calculateFee(totalTime.get(carId), fees))
                .toArray();
    }

    private int calculateFee(int time, int[] fees) {
        int basicTime = fees[0], basicFee = fees[1];
        int unitTime = fees[2], unitFee = fees[3];
        if (time <= basicTime) {
            return basicFee;
        }
        int extraTime = time - basicTime;
        int extraUnits = (int) Math.ceil((double) extraTime / unitTime);
        return basicFee + unitFee * extraUnits;
    }

    private int toMin(String time) {
        int[] timeArr = Arrays.stream(time.split(":"))
                .mapToInt(Integer::parseInt).toArray();
        return timeArr[0] * 60 + timeArr[1];
    }
}
