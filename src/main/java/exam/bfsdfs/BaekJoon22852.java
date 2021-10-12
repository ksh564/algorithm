package exam.bfsdfs;

import java.util.*;

public class BaekJoon22852 {
    static boolean [] jVisited;
    static boolean [] kVisited;
    static int[][] kIslands;
    static int[][] jIslands;
    static int N;
    static int kcount,jcount;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    N = scanner.nextInt();
    int jIndex = scanner.nextInt();
    int kIndex = scanner.nextInt();


    kIslands = new int[N+1][N+1];
    jIslands = new int[N+1][N+1];

    for(int i=1; i<jIndex; i++){
        int islandNum = scanner.nextInt();
        int connector = scanner.nextInt();
        jIslands[islandNum][connector] = 1;
        jIslands[connector][islandNum] = 1;
    }
    for(int i=1; i<kIndex; i++){
        int islandNum = scanner.nextInt();
        int connector = scanner.nextInt();
        kIslands[islandNum][connector] = 1;
        kIslands[connector][islandNum] = 1;
    }

    for(int j=1; j<N; j++){
        kcount = 0;
        jcount = 0;
        jVisited = new boolean[N+1];
        kVisited = new boolean[N+1];
        bfs(true,j,jIslands,jVisited);
        bfs(false,j,kIslands,kVisited);

        if(kcount > jcount){
            System.out.print("J");
        } else if(kcount < jcount){
            System.out.print("K");
        } else {
            System.out.print("D");
        }
    }

}

    public static void dfs(boolean isJ,int point,int[][] islands, boolean[] visited){
        Stack<Integer> stack = new Stack<>();
        stack.push(point);
        visited[point] = true;
        if(isJ){
            jcount++;
        } else {
            kcount++;
        }
        while (!stack.isEmpty()){
            for(int i=1; i<=N; i++){
               if(islands[point][i] == 1 && visited[i] == false){
                    stack.push(i);
                    visited[i] = true;
                    dfs(isJ,i,islands,visited);
                }
            }
            stack.pop();
        }
    }

    public static void bfs(boolean isJ, int point,int[][] islands, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(point);
        visited[point] = true;
        if(isJ){
            jcount++;
        } else {
            kcount++;
        }
        while (!queue.isEmpty()){
            int x = queue.poll();
            for(int i=1; i<=N; i++){
                if(islands[x][i] == 1 && visited[i] == false){
                    queue.offer(i);
                    visited[i] = true;
                    if(isJ){
                        jcount++;
                    } else {
                        kcount++;
                    }
                }
            }
        }
    }
}


