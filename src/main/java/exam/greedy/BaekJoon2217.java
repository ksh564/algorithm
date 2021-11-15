package exam.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2217 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] ropes = new int[N];

        for(int i=0; i<N; i++){
            ropes[i] = scanner.nextInt();
        }

        Arrays.sort(ropes);
        int max = 0;
        for(int i=0; i<ropes.length; i++){
            int weight = ropes[i] * (ropes.length-i);
            max = Math.max(max,weight);
        }
        System.out.println(max);
    }
}
