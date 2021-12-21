package codility;

import java.util.ArrayList;
import java.util.Arrays;

public class Codility06 {
    public static void main(String[] args) {

    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length <= 2){
            return 0;
        }
        Arrays.sort(A);
        for(int i=0; i<A.length-2; i++){
            if((long)A[i]+A[i+1] > A[i+2]){
                return 1;
            }
        }
        return 0;

    }
}
