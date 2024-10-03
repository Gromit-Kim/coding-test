package programmers.level1;

public class L1_Solution_98 {
    // 동영상 재생기: https://school.programmers.co.kr/learn/courses/30/lessons/340213
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int cur = toSec(pos);

        int end = toSec(video_len);
        int op_s = toSec(op_start);
        int op_e = toSec(op_end);

        if(cur >= op_s && cur <= op_e){
            cur = op_e;
        }
        for(String command : commands){
            if(command.equals("next")){
                if(cur + 10 <= end){
                    cur += 10;
                }else{
                    cur = end;
                }
            }else if(command.equals("prev")){
                if(cur - 10 < 0){
                    cur = 0;
                }else{
                    cur -= 10;
                }
            }
            if(cur >= op_s && cur <= op_e){
                cur = op_e;
            }
        }
        return toStr(cur);
    }

    private int toSec(String time){
        String[] splited = time.split(":");
        int min = Integer.parseInt(splited[0]);
        int sec = Integer.parseInt(splited[1]);
        return min * 60 + sec;
    }

    private String toStr(int time){
        int min = time / 60;
        int sec = time % 60;
        return String.format("%02d:%02d", min, sec);
    }
}
