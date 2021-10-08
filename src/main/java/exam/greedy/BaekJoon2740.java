package exam.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon2740 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(), M = scanner.nextInt(), i,j,K,l;

        int[][] matrix1 = new int[N][M];

        for(i=0; i<N; i++){
            for(j=0; j<M; j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }
        M = scanner.nextInt();
        K = scanner.nextInt();

        int[][] matrix2 = new int[M][K];
        for(i=0; i<M; i++){
            for(l=0; l<K; l++){
                matrix2[i][l] = scanner.nextInt();
            }
        }

        int[][] result = new int[N][K];

        for(i=0; i<N; i++){
            for(j=0; j<K; j++){
                for(l=0; l<M; l++){
                    result[i][j] += matrix1[i][l] * matrix2[l][j];
                }
            }
        }

        for(i=0; i<N; i++){
            for(j=0; j<K; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
