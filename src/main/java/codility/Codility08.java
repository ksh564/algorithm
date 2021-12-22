package codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Codility08 {
    public static void main(String[] args) {

    }
    public int findDominator(int[] A){
        if(A.length < 1){
            return -1;
        }
        int result = -1;
        HashMap<Integer,List<Integer>> inputs = new HashMap();
        int dominatorNum = 0;
        int dominatorSize = 0;
        List<Integer> value;
        for(int i=0; i<A.length; i++){
            if(inputs.containsKey(A[i])){
                value = inputs.get(A[i]);
                value.add(i);
                inputs.put(A[i],value);
            } else {
                value = new ArrayList();
                value.add(i);
                inputs.put(A[i],value);
            }
            if(dominatorSize < value.size()){
                dominatorNum = A[i];
                dominatorSize = value.size();
            }
        }
        if(dominatorSize > A.length / 2){
            List<Integer> results = inputs.get(dominatorNum);
            result = results.get(0);
        }
        return result;
    }

    public int findEquiLeader(int[] A) {
        // write your code in Java SE 8
        Integer maxKey = 0;
        Integer count = 0;
        HashMap<Integer,Integer> leaders = new HashMap<>();
        for(int i=0; i<A.length; i++){
            if(!leaders.containsKey(A[i])){
                leaders.put(A[i],1);
                continue;
            }
            Integer leadersCount = leaders.get(A[i]);
            leadersCount++;
            leaders.put(A[i],leadersCount);
            if(count < leadersCount){
                maxKey = A[i];
                count = leadersCount;
            }
        }

        Integer leaderCount = 0;
        Integer equiLeaderCount = 0;
        for(int i=0; i<A.length; i++){
            if(A[i] == maxKey){
                leaderCount++;
            }
            if((leaderCount > (i+1)/2) && (count - leaderCount) > (A.length-(i+1))/2){
                equiLeaderCount++;
            }
        }
        return equiLeaderCount;
    }

}
