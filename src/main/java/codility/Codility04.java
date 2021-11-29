package codility;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

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


}
