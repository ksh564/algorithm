package exam.greedy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BaekJoon1439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] arr = input.split("(?<!^)");
        int zeroCount = 0;
        int oneCount = 0;

        for(int i=0; i<arr.length; i++){
            if(i == 0){
                if("0".equals(arr[i])){
                    zeroCount++;
                } else {
                    oneCount++;
                }
            } else {
                if(!arr[i-1].equals(arr[i])){
                    if("0".equals(arr[i])){
                        zeroCount++;
                    } else {
                        oneCount++;
                    }
                }
            }
        }
        if(zeroCount>oneCount){
            System.out.println(oneCount);
        } else {
            System.out.println(zeroCount);
        }
    }
}
