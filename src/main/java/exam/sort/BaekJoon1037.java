package exam.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon1037 {
    static int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] inputStr = input.split(" ");
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<inputStr.length; i++){
            arrayList.add(Integer.parseInt((inputStr[i])));
        }

        Collections.sort(arrayList);
        System.out.println(arrayList.get(0) * arrayList.get(arrayList.size()-1));
    }
}
