package codility;

public class Codility02 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,8,9,7,6},3));
    }
    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        for(int i=0; i<K; i++){
            int[] tmpArray = new int[A.length];
            for(int j=0; j<A.length; j++){
                if(j == 0){
                    tmpArray[0] = A[A.length-1];
                    continue;
                }
                tmpArray[j] = A[j-1];
                if(j == A.length-1){
                    A = tmpArray;
                    break;
                }
            }
        }
        return A;
    }
}
