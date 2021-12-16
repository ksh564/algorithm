package codility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Codility12 {
    public static void main(String[] args) {
        String str = new String();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        try {
            long diff = dateFormat.parse("2").getTime() - dateFormat.parse("3").getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        solution(10,4);
    }
    public static int solution(int N, int M){
        // write your code in Java SE 8
        boolean[] isEatchocolates = new boolean[N];
        ArrayList<Integer> selectedChocolates = new ArrayList();

        int i=0;
        int count = 0;
        while(isEatchocolates[i]==false){
            isEatchocolates[i] = true;
            count++;
            i+=M;
            if(i>=N){
                i%=N;
            }
            System.out.println(i);
        }
        return count;
    }
}
