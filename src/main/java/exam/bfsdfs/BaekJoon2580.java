package exam.bfsdfs;

import java.awt.*;
import java.util.*;

public class BaekJoon2580 {
    static int M,N,K,count;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] maps;
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        M = scanner.nextInt();
        N = scanner.nextInt();
        K = scanner.nextInt();
        scanner.nextLine();
        maps = new int[M][N];
        //

        for (int i=0; i<K; i++){
          String str = scanner.nextLine();
          String[] inputStr = str.split(" ");
            int preX = Integer.parseInt(inputStr[0]);
            int preY = Integer.parseInt(inputStr[1]);
            int nextX = Integer.parseInt(inputStr[2]);
            int nextY = Integer.parseInt(inputStr[3]);
//          int preX = scanner.nextInt();
//          int preY = scanner.nextInt();
//          int nextX = scanner.nextInt();
//          int nextY = scanner.nextInt();

          for(int j=preY; j<nextY; j++){
              for(int k=preX; k<nextX; k++){
                  maps[j][k] = 1;
              }
          }
        }

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                count = 0;
                if(getSquare(i,j) == true){
                }
                if(count > 0){
                    arrayList.add(count);
                }
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for(int input : arrayList){
            System.out.print(input+" ");
        }
    }

    public static boolean getSquare(int inputX, int inputY){

        if(inputX < 0 || inputY < 0 || inputX >= N || inputY >= M){
            return false;
        }
        if(maps[inputY][inputX] == 0){
            maps[inputY][inputX] = 1;
            getSquare(inputX+1,inputY);
            getSquare(inputX-1,inputY);
            getSquare(inputX,inputY-1);
            getSquare(inputX,inputY+1);
            count++;
            return true;
        }
        return false;
    }


}
