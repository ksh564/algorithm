package exam.greedy;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BaekJoon1260 {

    static boolean visited[];
    static int[][] maps;
    static int N,M,V;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        V = scanner.nextInt();

        visited = new boolean[N+1];
        maps = new int[N+1][N+1];

        for(int i=1; i<=M; i++){
            int start = scanner.nextInt();
            int arrived = scanner.nextInt();
            maps[start][arrived] = 1;
        }
        System.out.println("DFS Start");
        dfs(V);
        visited = new boolean[N+1];
        System.out.println("BFS Start");
        bfs(V);

    }

    public static void dfs(int point){
        Stack stack = new Stack();
        stack.push(point);
        visited[point] = true;
        System.out.print(point + "->");

        while (!stack.isEmpty()){
            int index = (int) stack.peek();
            stack.pop();
            for(int i=1; i<=N; i++){
                if(maps[index][i] == 1 && visited[i] == false){
                    dfs(i);
                }
            }
        }

    }
    public static void bfs(int point){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(point);
        while (!queue.isEmpty()){
            int index = queue.poll();
            visited[index] = true;
            System.out.print(index + "->");
            for(int i=1; i<=N; i++){
                if(maps[index][i] == 1 && visited[i] == false){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}
