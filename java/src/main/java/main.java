import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());

        br.close();
    }
}