package programmers.level0;

public class L0_Solution_164 {
    // 10page - 영어가 싫어요: https://school.programmers.co.kr/learn/courses/30/lessons/120894
    public long solution(String numbers) {
        numbers = numbers.replace("zero","0");
        numbers = numbers.replace("one","1");
        numbers = numbers.replace("two","2");
        numbers = numbers.replace("three","3");
        numbers = numbers.replace("four","4");
        numbers = numbers.replace("five","5");
        numbers = numbers.replace("six","6");
        numbers = numbers.replace("seven","7");
        numbers = numbers.replace("eight","8");
        numbers = numbers.replace("nine","9");

        return Long.parseLong(numbers);
    }
}
