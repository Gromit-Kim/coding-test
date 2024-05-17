package programmers;

public class L1_Solution_80 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int endTime = attacks[attacks.length - 1][0];
        Player player = new Player(health, 0, false);
        int attacksIdx = 0;
        for (int t = 1; t <= endTime; t++) {
            if (attacks[attacksIdx][0] == t) {
                player.health -= attacks[attacksIdx++][1];
                player.isAttacked = true;
            }
            if (player.health <= 0) {
                return -1;
            }
            if (player.isAttacked) {
                player.isAttacked = false;
                player.bandageTime = 0;
            } else {
                player.updateHealth(bandage[1]);
                player.bandageTime++;
                player.checkAdditional(bandage[0], bandage[2]);
            }
            System.out.println("t : " + t + ", health : " + player.health + ", duration: " + player.bandageTime);
        }
        return player.health;
    }
}

class Player {
    private int max_health;
    public int health;
    public int bandageTime;
    public boolean isAttacked;

    public Player() {
    }

    public Player(int _h, int _b, boolean _a) {
        max_health = _h;
        health = _h;
        bandageTime = _b;
        isAttacked = _a;
    }

    public void updateHealth(int num) {
        if (num + health <= max_health) {
            health += num;
        }else{
            health = max_health;
        }
    }

    public void checkAdditional(int duration, int bonus) {
        if (bandageTime == duration) {
            updateHealth(bonus);
            bandageTime = 0;
        }
    }
}
