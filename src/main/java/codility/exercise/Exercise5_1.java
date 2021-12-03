package codility.exercise;

public class Exercise5_1 {

    class Solution {
        public int solution(int N) {
            // write your code in Java SE 8
            int remainder = 0;
            int divides = N;
            int count = 0;
            if(N == 0 || N == 1){
                return count;
            }
            while(remainder == 0){
                divides /= 2;
                remainder = divides % 2 ;
                count++;
            }
            return count;
        }
    }
}
