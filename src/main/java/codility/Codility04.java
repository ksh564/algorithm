package codility;

import java.util.*;

public class Codility04 {
    public static void main(String[] args) {
       solution(5,new int[]{1,3,1,4,2,3,5,4});


    }
    public static int solution(int X, int[] A){
        int result = -1;
        Map<Integer, Integer> check = new HashMap<>();

        for(int i=1; i<=X; i++){
            check.put(i,i);
        }
        for(int i=0; i<A.length; i++){
            if(check.containsKey(A[i])){
                check.remove(A[i]);
            }
            if(check.isEmpty()){
                result = i;
                break;
            }
        }
        return result;
    }
    public static int solution2(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> inputHash = new HashSet<>();
        for(int i=1; i<=A.length; i++){
            inputHash.add(i);
        }
        for(int i=0; i<A.length; i++){
            if(inputHash.contains(A[i])){
                inputHash.remove(A[i]);
            }
        }
        if(inputHash.isEmpty()){
            return 1;
        } else {
            return 0;
        }
    }
}
