package exam.bfsdfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon2178 {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,-1,1};

    static int N,M;
    static int[][] maps;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine();

        maps = new int[N][M];

        for(int i=0; i<N; i++){
            String inputStr = scanner.nextLine();
         for(int j=0; j<inputStr.length(); j++){
            maps[i][j] = inputStr.charAt(j) - '0';
         }
        }

        System.out.println(bfs(0,0));
    }

    public static int bfs(int x, int y){
        Queue<Pointer> queue = new LinkedList<>();
        queue.offer(new Pointer(x,y));

        while (!queue.isEmpty()){
           Pointer pointer = queue.poll();
             x = pointer.getX();
             y = pointer.getY();
           for(int i=0; i<4; i++){
               int currX = x + dx[i];
               int currY = y + dy[i];

                if(currX < 0 || currY < 0 || currX >= N || currY >= M)
                    continue;
                if(maps[currX][currY] == 0)
                    continue;

               if(maps[currX][currY] == 1){
                   maps[currX][currY] = maps[x][y] + 1;
                   queue.offer(new Pointer(currX,currY));
               }
           }
        }
        return maps[N-1][M-1];
    }
    static class Pointer {
        int x,y;
        Pointer(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
