package exam.bfsdfs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon4963 {
    static ArrayList<int[][]> maps = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.nextLine();
            if(a == 0 && b == 0 ){
                break;
            }

            int[][] map = new int[b][a];

            for(int i=0; i<b; i++){
                String inputStr = scanner.nextLine();
                String[] inputArry = inputStr.split(" ");
                for (int j=0; j<inputArry.length; j++){
                    map[i][j] = Integer.parseInt(inputArry[j]);
                }
            }
            maps.add(map);
        }
        for(int i=0; i<maps.size(); i++){
            int count = 0;
            int [][] map = maps.get(i);
            for(int j=0; j<map.length; j++){
                for(int k=0; k<map[j].length; k++){
                    if(getLand(j,k,i) == true){
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static boolean getLand(int x, int y, int mapIndex){

        Stack stack = new Stack();
        stack.push(x);

        while (!stack.isEmpty()){
            int index = (int)stack.pop();
            for(int i=0; i<maps.get(mapIndex).length; i++){
                int [][] map = maps.get(mapIndex);
                if(map[index][i] == 1){
                    map[index][i] = 0;
                    stack.push(i);
                    return true;
                }
            }
        }
        return false;
    }
class SnakePoint {
    int x,y;
    SnakePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

}
}
