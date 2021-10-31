package exam.dynamic;

import java.util.Arrays;

public class Programmers43238 {
    public static void main(String[] args) {
        int[] input = {7,10};
        int intInput = 6;

        System.out.println(solution(intInput,input));
    }

    private static long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long left = 0;
        long right  = n * times[times.length-1];

        while (left<=right){
            long mid = (left + right) / 2;
            long sum = 0;
            for(int i=0; i<times.length; i++){
                sum += mid / times[i];
            }
            if(sum > n){
                right = mid-1;
                answer = mid;
            } else {
                left = mid+1;
            }
        }
        return answer;
    }
}
