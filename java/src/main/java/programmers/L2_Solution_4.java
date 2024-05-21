package programmers;

public class L2_Solution_4 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = s.split(" ", -1);
        for (String str : strArr) {
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                char cur = str.charAt(i);
                if (i == 0 && Character.isAlphabetic(cur)) {
                    sb.append(Character.toUpperCase(cur));
                } else {
                    sb.append(cur);
                }
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
