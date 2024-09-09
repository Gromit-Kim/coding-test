package programmers.level0;

public class L0_Solution_24 {
    public int solution(String my_string) {
        return my_string.chars()
                .filter(Character::isDigit)
                .map(ch -> ch - '0')
                .sum();
    }
}
