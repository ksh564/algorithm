package exam.dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon1300 {
    static int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int[][] arr = new int[N+1][N+1];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=1; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                arrayList.add(i*j);
            }
        }
        Collections.sort(arrayList);
        int index = scanner.nextInt();
        System.out.println(arrayList.get(index));
    }
}
