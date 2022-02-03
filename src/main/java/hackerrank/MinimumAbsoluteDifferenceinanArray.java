package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceinanArray {
//    public static int minimumAbsoluteDifference(List<Integer> arr) {
//        // Write your code here
//        int result = 0;
//        for(int i=0; i<arr.size()-1; i++){
//            for(int j=i+1; j<arr.size(); j++){
//               result = Math.min(result,Math.abs(arr.get(i) - arr.get(j)));
//            }
//        }
//        return result;
//    }
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int result = Math.abs(arr.get(0)-arr.get(1));
        for(int i=0; i<arr.size()-1; i++){
            result   = Math.min(result,Math.abs(arr.get(i)-arr.get(i+1)));
        }
        return result;
    }
}
