package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dijkstra {
    public static final int INF = (int) 1e9;
    public static  int n, m, start;
    public static ArrayList<ArrayList<NodeOfDijkstra>> graph = new ArrayList<>();
    public static boolean[] visited = new boolean[100001];
    public static int[] distance = new int[100001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        start = scanner.nextInt();

        // 그래프 초기화
        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<NodeOfDijkstra>());
        }
        for (int i=0; i<m; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            graph.get(a).add(new NodeOfDijkstra(b, c));
        }

        Arrays.fill(distance, INF);

        dijkstra(start);

        for(int i=1; i<=n; i++){

        }
    }
    public static int getSmallestNode(){
        int minValue = INF;
        int index = 0;
        for (int i=1; i<=n; i++){
            if(distance[i] < minValue && !visited[i]){
                minValue = distance[i];
                index = i;
            }
        }
        return index;
    }
    public static void dijkstra(int start){
        distance[start] = 0;
        visited[start] = true;
        for (int i=0; i<graph.get(start).size(); i++){
            distance[graph.get(start).get(i).getIndex()] = graph.get(start).get(i).getDistance();
        }
        for (int i=0; i<n-1; i++) {
            int now = getSmallestNode();
            visited[now] = true;

            for(int j=0; j<graph.get(now).size(); j++){
                int cost = distance[now] + graph.get(now).get(j).getDistance();

                if(cost < distance[graph.get(now).get(j).getIndex()]){
                    distance[graph.get(now).get(j).getIndex()] = cost;
                }
            }
        }
    }
}



class NodeOfDijkstra {
    private int index;
    private int distance;
    public NodeOfDijkstra(int index, int distance){
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
