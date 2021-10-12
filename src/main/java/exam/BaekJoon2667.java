package exam;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class BaekJoon2667 {
    static boolean visited[];
    static int[][] maps;
    static int N,M,V,count;
    static ArrayList<Integer> counts;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        visited = new boolean[N];
        maps = new int[N][N];
        scanner.nextLine();

        for(int i=0; i<N; i++){
           String strRow = scanner.nextLine();
           for(int j=0; j<strRow.length(); j++){
               maps[i][j] = strRow.charAt(j)-'0';
           }
        }
        counts = new ArrayList<>();
        int danjiNum = 0;
        for(int i=0; i<=N; i++){
            for(int j=0; j<=N; j++){
                count = 0;
                if(getDanji(i,j) == true){
                    danjiNum++;
                    counts.add(count);
                }
            }
        }
        System.out.println(danjiNum);
        Collections.sort(counts);
        for(Integer num : counts){
            System.out.println(num);
        }

    }
    public static boolean getDanji(int x, int y){

        if(x <= -1 || y <= -1 || x >= N || y >= N){
            return false;
        }
        if(maps[x][y] == 1){
            count++;
            maps[x][y] = 0;
            getDanji(x-1,y);
            getDanji(x+1,y);
            getDanji(x,y+1);
            getDanji(x,y-1);
            return true;
        }
        return false;
    }
}
