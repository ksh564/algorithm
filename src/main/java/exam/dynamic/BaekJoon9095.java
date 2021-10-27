package exam.dynamic;

import java.util.Scanner;

public class BaekJoon9095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[11];
        array[1] = 1;
        array[2] = 2;
        array[3] = 4;
        array[4] = 7;

        for(int i=4; i<11; i++){
            array[i] = array[i-1] + array[i-2] + array[i-3];
        }

        for(int i=1; i<N+1; i++){
            System.out.println(array[scanner.nextInt()]);
        }
    }
}
