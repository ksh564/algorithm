package exam.bfsdfs;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon1012 {
    static int[][] land;
    static int T, M, N, K, count;
    static boolean[][] visited;
    static ArrayList answer;

    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) {
        answer = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        scanner.nextLine();
        for (int start = 0; start < T; start++) {
            count = 0;
            M = scanner.nextInt();
            N = scanner.nextInt();
            K = scanner.nextInt();
            scanner.nextLine();
            land = new int[N][M];
            visited = new boolean[N][M];
            for (int i = 0; i < K; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                scanner.nextLine();
                land[y][x] = 1;
            }
            for (int y = 0; y < land.length; y++) {
                for (int x = 0; x < land[y].length; x++) {
                    if (!visited[y][x] && land[y][x] == 1) {
                        dfs(land, x, y);
                        count++;
                    }
                }
            }
            answer.add(count);
        }
        for(int i=0; i<answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }

    public static void dfs(int[][] land, int x, int y) {

        if (land[y][x] != 1 || visited[y][x]){
            return;
        }
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int yPoint = y + dy[i];
            int xPoint = x + dx[i];

            if (xPoint >= 0 && yPoint >= 0 && xPoint < M && yPoint < N) {
                    dfs(land, xPoint, yPoint);
            }
        }
    }
}
