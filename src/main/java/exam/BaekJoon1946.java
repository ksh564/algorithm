package exam;

import java.util.Scanner;

public class BaekJoon1946 {
    static int T;
    static int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        for(int i=0; i<T; i++){
            int N = scanner.nextInt();
            int[][] record = new int[N][2];

            for(int j=0; j<N; j++){
                record[j][0] = scanner.nextInt();
                record[j][1] = scanner.nextInt();
            }
        }
    }
}
