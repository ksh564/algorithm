package exam.greedy;

import java.util.Scanner;

public class BaekJoon2720 {
    public static void main(String[] args) {
        int[] coins = {25,10,5,1};
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=0; i<N; i++){
            int input = scanner.nextInt();
            for(int j=0; j<coins.length; j++){
                int res = input / coins[j];
                input = input % coins[j];
                System.out.print(res+ " ");
            }
            System.out.println();
        }
    }
}
