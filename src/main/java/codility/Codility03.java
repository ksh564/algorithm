package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Codility03 {
    public static void main(String[] args) {

    }
    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int count = 0;
        while(X<Y){
            X += D;
            count++;
        }
        return count;
    }

    public static int solution3(int[] A){

        int min = Integer.MAX_VALUE;
        int preSum = A[0];
        int postSum = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=1; i<A.length; i++){
            postSum += A[i];
        }
        min = Math.abs(preSum-postSum);

        for(int i=1; i<A.length-1; i++){
            preSum += A[i];
            postSum -= A[i];
            if(Math.abs(preSum-postSum) < min){
                min = Math.abs(preSum-postSum);
            }
        }
        return min;
    }
}
