package exam.dynamic;

public class Programmers42895 {
    private static int target;
    private static int answer;
    private static int solution(int N, int number){

        dfs(N,number,0,0);
        return answer;
    }

    private static void dfs(int n, int number, int count, int value){
        if(count > 8){
            answer = -1;
            return;
        }

        if(value == number){
            answer = Math.min(count,answer);
            return;
        }
        int nn = 0;
        for(int i=0; i<8; i++){
            nn = nn * 10 + n;
            dfs(n,number,count+i, value*nn);
            dfs(n,number,count+i, value/nn);
            dfs(n,number,count+i, value+nn);
            dfs(n,number,count+i, value-nn);
        }
    }
}
