package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon11399 {
    private static int N, result;
    private static int[] arr;
    public static void main(String[] args) {
        N = 0;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        recursion(1);
        System.out.println(result);
    }

    public static void recursion(int n){
        if(n > N)
        return;
        int innerResult = 0;
        for(int i=0; i<n; i++){
            innerResult += arr[i];
        }
        n++;
        result += innerResult;
        recursion(n);
    }
}
