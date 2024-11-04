package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class L2_Solution_50 {
    // [3차] 파일명 정렬: https://school.programmers.co.kr/learn/courses/30/lessons/17686
    public String[] solution(String[] files) {
        List<File> lst = new ArrayList<>();
        for (String file : files) {
            lst.add(new File(file));
        }
        return lst.stream().sorted().map(File::toString).toArray(String[]::new);
    }

    class File implements Comparable<File> {
        public String head;
        public String number;
        public String tail = "";

        public File(String file) {
            parseFile(file);
        }

        private void parseFile(String file) {
            int i = 0;
            while (i < file.length() && !Character.isDigit(file.charAt(i))) {
                i++;
            }
            this.head = file.substring(0, i);

            int numStart = i;
            while (i < file.length() && Character.isDigit(file.charAt(i))) {
                i++;
            }
            number = file.substring(numStart, i);

            if (i < file.length()) {
                tail = file.substring(i);
            }
        }


        @Override
        public String toString() {
            return head + number + tail;
        }

        @Override
        public int compareTo(File o) {
            int headCompare = this.head.compareToIgnoreCase(o.head);
            if (headCompare != 0) {
                return headCompare;
            }
            int n1 = Integer.parseInt(this.number);
            int n2 = Integer.parseInt(o.number);
            return Integer.compare(n1, n2);
        }
    }
}
