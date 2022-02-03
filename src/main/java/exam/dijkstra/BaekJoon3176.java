package exam.dijkstra;

import java.util.Scanner;

public class BaekJoon3176 {
    public static int N;
    public static int K;
    public static int[][] roads;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        roads = new int[N][N];

        for(int i=1; i<N; i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int cost = scanner.nextInt();
            roads[start][end] = cost;
            roads[end][start] = cost;
        }
        K = scanner.nextInt();

        for(int i=1; i<K; i++){
            int input = scanner.nextInt();
            int ouput = scanner.nextInt();
            for(int j=1; j<N; j++){
                if(j == ouput){

                }
            }
        }

    }
}
