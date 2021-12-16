package exam.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int C = scanner.nextInt();
        int[] routers = new int[N];
        for(int i=0; i<N; i++){
            routers[i] = scanner.nextInt();
        }
        Arrays.sort(routers);

        int left = 1;
        int right = routers[routers.length-1] - routers[0];
        while (left <= right){
            int mid = (left/right) / 2;
            int count = 1;

            if(count >= C){

            } else {

            }
        }

    }
}
