package programmers.level1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L1_Solution_77 {
    // [1차] 다트게임 : https://school.programmers.co.kr/learn/courses/30/lessons/17682
    private static Pattern pattern = Pattern.compile("[0-9]{1,2}[SDT][*#]?");

    public int solution(String dartResult) {
        int[] scores = new int[3];
        int scoreIdx = -1;

        Matcher matcher = pattern.matcher(dartResult);
        while (matcher.find()) {
            String curStr = matcher.group();
            scoreIdx++;

            int score = 0;
            int number = Integer.parseInt(curStr.substring(0, curStr.length() - 2 < 0 ? 1 : 2));

            char bonus = curStr.charAt(curStr.length() - 2);
            score = switch (bonus) {
                case 'S' -> number;
                case 'D' -> (int) Math.pow(number, 2);
                case 'T' -> (int) Math.pow(number, 3);
                default -> score;
            };

            if (curStr.length() == 3) {
                char option = curStr.charAt(curStr.length() - 1);
                if (option == '*') {
                    score *= 2;
                    if (scoreIdx > 0) {
                        scores[scoreIdx - 1] *= 2;
                    }
                } else if (option == '#') {
                    score *= -1;
                }
            }

            scores[scoreIdx] = score;
        }

        return scores[0] + scores[1] + scores[2];
    }
}
