package hackerrank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BeautifulPairs {
    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        // Write your code here
//        HashSet<Integer> aHash = new HashSet<>(A);
//        HashSet<Integer> bHash = new HashSet<>(B);
//
//        Iterator iterator = bHash.iterator();
//
//        int output = 0;
//        while (iterator.hasNext()){
//            int a = (Integer) iterator.next();
//            if(aHash.contains(a)){
//                output++;
//                aHash.remove(a);
//                iterator.remove();
//            }
//        }
//        if(aHash.size() > bHash.size()){
//            return output;
//        } else if(aHash.size() == bHash.size())
//        return output;
        int result = 0;
        for(int i=0; i<A.size(); i++){
            for(int j=0; j<B.size(); j++){
                if(A.get(i).equals(B.get(j))){
                    result++;
                    A.set(i,-1);
                    B.set(j,-1);
                    break;
                }
            }
        }
        if(result == A.size()){
            return result-1;
        } else {
            return result+1;
        }
    }
}
