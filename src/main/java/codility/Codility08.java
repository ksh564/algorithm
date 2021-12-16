package codility;

import java.util.HashMap;

public class Codility08 {
    public static void main(String[] args) {

    }
    public static int solution(int[] A){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int max = -1;
        for(int i=0; i<A.length; i++){
            if(hashMap.containsKey(A[i])){
                int value = hashMap.get(A[i]);
                hashMap.put(A[i],value+1);
                max = Math.max(max,value+1);
            }else{
                hashMap.put(A[i],1);
            }
        }
        if(max <= A.length / 2){
            max = -1;
        }
        return max;
    }
}
