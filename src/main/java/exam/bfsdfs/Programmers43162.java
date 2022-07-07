package exam.bfsdfs;

public class Programmers43162 {
    static boolean[] visted;
    static int count;

    public static void main(String[] args) {
        int[][] computers = {{1,1,0},{1,1,1},{0,1,1}};
        solution(3,computers);
    }

    public static int solution(int n, int[][] computers) {
        count = 0;
        visted = new boolean[computers.length];

        for(int i=0; i<n; i++){
            if(!visted[i]){
                dfs(computers,i);
                count++;
            }

        }
        return count;
    }

    public static void dfs(int[][] computers, int index){
        visted[index] = true;
        for(int i=0; i<computers[index].length; i++){
            if(!visted[i] && computers[index][i] == 1)
            dfs(computers,i);
        }
    }
}
