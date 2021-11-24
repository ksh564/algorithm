package codility;

import java.util.HashSet;
import java.util.Set;

public class CodilityTimeComplexity2 {
    public static void main(String[] args) {
       solution(new int[]{2, 3, 1, 5});
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=1; i<=A.length+1; i++){
            set.add(i);
        }
        for(int i=0; i<A.length; i++){
            if(set.contains(A[i])){
                set.remove(A[i]);
            }
        }
        result = (int)set.iterator().next();

        return result;
    }
}
