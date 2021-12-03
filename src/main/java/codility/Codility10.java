package codility;

import java.util.ArrayList;

public class Codility10 {
    public static void main(String[] args) {
        solution(new int[]{3,2,6,-1,4,5,-1,2});

    }
// public static int solution(int N){
//        double sqrt = Math.sqrt(N);
//        System.out.println(sqrt);
//        for(int i=1; i<=sqrt; i++){
//            if(N % i == 0) {
//
//            }
//        }
//        return 0;
//    }

    public static int solution(int[] A) {
        int partialSum = 0;
        int maxSum = 0;
        if(A.length == 3){
            return 0;
        }
        ArrayList<Integer> sums = new ArrayList<>();
        for(int i=1; i<A.length-1; i++){
            partialSum = Math.max(partialSum,partialSum+A[i]);
            if(partialSum > maxSum){
                maxSum = Math.max(partialSum,maxSum);
                sums.add(maxSum);
            } else {
                partialSum = 0;
            }
        }
        return sums.get(sums.size()-1)+sums.get(sums.size()-2);
    }
}
