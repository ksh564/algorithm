package exam;

import java.util.Scanner;

public class BaekJoon1789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long sum = 0;
        long addNum = 0;
        while (N >= sum){
            sum += (++addNum);
        }
        if(sum == N){
            System.out.println(addNum);
        } else {
            System.out.println(addNum-1);
        }
    }
}
