package exam.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon2752 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        ArrayList<Integer> outPut = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(inputStr, " ");

        while (stringTokenizer.hasMoreTokens()) {
            outPut.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        Collections.sort(outPut);
        for(Integer element : outPut){
            System.out.print(element+" ");
        }
    }
}
