package exam.dijkstra;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1389 {
    private static int N,M;
    private static int [][] relations;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        relations = new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(i!=j) relations[i][j] = 99999;
            }
        }
        for(int i=1; i<=N; i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            relations[start][end] = 1;
            relations[end][start] = 1;
        }
        floyd();
        int min = Integer.MAX_VALUE;
        int minIndex = 1;
        int[] res = new int[N+1];
        for(int i=1; i<=N; i++){
            int sum = 0;
            for(int j=1; j<=N; j++){
                sum += relations[i][j];
            }
            res[i] = sum;
            if(min > sum){
                min = sum;
                minIndex = i;
            }
        }
    }
    public static void floyd(){
        for(int k=1; k<=N; k++){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++){
                    relations[i][j] = Math.min(relations[i][j],relations[i][k]+relations[k][j]);
                }
            }
        }
    }
}
