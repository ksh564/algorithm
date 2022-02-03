package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarcsCakewalk {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        marcsCakewalk(arr);
    }
    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        long result = 0;
        Collections.sort(calorie,Collections.reverseOrder());
        for(int i=0; i<calorie.size(); i++){
           result += (calorie.get(i) * Math.pow(2,i)); //칼로리 값*2^0 + 2^1 + 2^2
        }
        return result;
    }
}
