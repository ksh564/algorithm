package exam.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon2309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<9; i++){
            arrayList.add(scanner.nextInt());
        }

        while (true){
            int answer = 0;
            Collections.shuffle(arrayList);
            for(int i=0; i<7; i++){
                answer+=arrayList.get(i);
            }
            if(answer == 100){
                arrayList.remove(8);
                arrayList.remove(7);
                Collections.sort(arrayList);
                for(int i=0; i<7; i++){
                    System.out.println(arrayList.get(i));
                }
                break;
            }
        }
    }
}
