package exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//test
public class BaekJoon11047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count  = scanner.nextInt();
        int total  = scanner.nextInt();
        int result = 0;

        Integer[] arr = new Integer[count];

        for(int i=0; i<count; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for(int j=0; j<count; j++){
            result += total / arr[j];
            total %= arr[j];
        }
        System.out.println(result);
    }
}
