package programmers;

import java.util.HashMap;
import java.util.Map;

public class L2_Solution_41 {
    public int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();

        for(int t : topping){
            right.put(t, right.getOrDefault(t, 0) + 1);
        }

        for(int i = 0; i < topping.length - 1; i++){
            int t = topping[i];

            left.put(t, left.getOrDefault(t, 0) + 1);
            if(right.get(t) == 1){
                right.remove(t);
            }else{
                right.put(t, right.get(t) - 1);
            }

            if(left.size() == right.size())
                answer++;
        }

        return answer;
    }
}
