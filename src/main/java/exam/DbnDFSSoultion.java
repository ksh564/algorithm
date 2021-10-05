package exam;

public class DbnDFSSoultion {

    public static int n, m;
    public static  int[][] graph = new int[1000][1000];

    public static void main(String[] args) {

    }

    public static boolean dfs(int x, int y){

        if(x <= -1 || x >=n || y <= -1 || y >= m){
            return false;
        }

        if(graph[x][y] == 0) {
            graph[x][y] = 1;
            dfs(x-1, y);
            dfs(x,y-1);
            dfs(x+1, y);
            dfs(x,y+1);
            return true;
        }
        return false;
    }
}
