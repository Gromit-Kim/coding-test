package programmers.level2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L2_Solution_54 {
    // 소수 찾기: https://school.programmers.co.kr/learn/courses/30/lessons/42839?language=java
    public int solution(String numbers) {
        return (int) makeNumbers(numbers)
                .stream()
                .filter(this::isPrime)
                .count();
    }

    private List<Integer> makeNumbers(String numbers) {
        Set<Integer> set = new HashSet<>();
        permute(numbers, "", set);
        return set.stream().toList();
    }

    private void permute(String str, String prefix, Set<Integer> set) {
        if (!prefix.isEmpty()) {
            int num = Integer.parseInt(prefix);
            set.add(num);
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), set);
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
