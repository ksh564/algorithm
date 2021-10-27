package exam.dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2512 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrBudget = new int[N];
        long answer = 0;

        for(int i=0; i<N; i++){
            arrBudget[i] = scanner.nextInt();
        }

        long entireBudget = scanner.nextLong();
        Arrays.sort(arrBudget);
        long left = 0;
        long right = arrBudget[N-1];
        while (left<=right){
            long mid = (left+right) / 2;
            long sum = 0;
            for(int money : arrBudget){
                if(money >= mid) {
                    sum += mid;
                } else {
                    sum += money;
                }
            }
            if(sum > entireBudget){
                right = mid-1;
            } else {
                left = mid+1;
                answer = Math.max(answer,mid);
            }

        }
        System.out.println(answer);
    }
}
