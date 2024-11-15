package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class L2_Solution_53 {
    // 다리를 지나는 트럭: https://school.programmers.co.kr/learn/courses/30/lessons/42583?language=java
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Truck> waitQ = new LinkedList<>();
        Queue<Truck> moveQ = new LinkedList<>();

        for (int t : truck_weights) {
            waitQ.offer(new Truck(t));
        }

        int time = 0;
        while(!waitQ.isEmpty() || !moveQ.isEmpty()){
            time++;

            if(moveQ.isEmpty()){
                Truck t = waitQ.poll();
                moveQ.offer(t);
                continue;
            }

            for(Truck t : moveQ){
                t.move();
            }

            if(moveQ.peek().pos > bridge_length){
                moveQ.poll();
            }

            int curWeight = moveQ.stream().mapToInt(truck -> truck.weight).sum();
            if(!waitQ.isEmpty() && curWeight + waitQ.peek().weight <= weight){
                Truck t = waitQ.poll();
                moveQ.offer(t);
            }
        }

        return time;
    }

    class Truck {
        public int weight;
        public int pos;

        public Truck(int weight) {
            this.weight = weight;
            this.pos = 1;
        }

        public void move() {
            this.pos++;
        }
    }

}
