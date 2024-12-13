package programmers.level2;

import java.util.PriorityQueue;

public class L2_Solution_65 {
    // L2 호텔대실: https://school.programmers.co.kr/learn/courses/30/lessons/155651
    public int solution(String[][] book_time){
        PriorityQueue<Book> books = new PriorityQueue<>();
        for(String[] book : book_time){
            books.add(new Book(book[0], book[1]));
        }

        PriorityQueue<Integer> rooms = new PriorityQueue<>(); // 끝나는 시간 기준 최소 힙
        while(!books.isEmpty()){
            Book book = books.poll(); // 가장 빠른 시작 시간의 예약
            if(!rooms.isEmpty() && rooms.peek() + 10 <= book.start){
                rooms.poll(); // 기존 방 종료 시간 제거
            }
            rooms.add(book.end);
        }
        return rooms.size();
    }

    class Book implements Comparable<Book>{
        public int start;
        public int end;

        public Book(String start, String end){
            this.start = toMin(start);
            this.end = toMin(end);
        }

        @Override
        public int compareTo(Book o){
            return Integer.compare(this.start, o.start);
        }
    }

    private int toMin(String time){
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]) * 60;
        int min = Integer.parseInt(split[1]);
        return hour + min;
    }
}
