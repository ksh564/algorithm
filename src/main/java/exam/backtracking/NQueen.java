package exam.backtracking;

import java.util.Scanner;

public class NQueen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
//row column
        boolean[][] chess = new boolean[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(i == j) {
                    chess[i][j] = true;
                }
            }
        }
    }
}
