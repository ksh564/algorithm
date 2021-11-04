package exam.dijkstra;

import java.util.Scanner;

public class BaekJoon10159 {
    private static int N;
    private static int M;
    private static int[][] weights;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        weights = new int[N+1][N+1];

        for(int i=1; i<=M; i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            weights[start][end] = 1;
            weights[end][start] = -1;
        }
        floyd();
        for(int i=1; i<=N; i++){
            int count = N-1;
            for(int j=1; j<=N; j++){
                if(weights[i][j] != 0){
                    count--;
                }
            }
            System.out.println(count);
        }
    }

    private static void floyd() {
        for(int k = 1; k <= N; k++){
            for(int i = 1; i<=N; i++){
                for(int j= 1; j<=N; j++){
                    if(weights[i][k] == weights[k][j] && weights[i][k] != 0){
                        weights[i][j] = weights[i][k];
                    }
                }
            }
        }
    }
}
