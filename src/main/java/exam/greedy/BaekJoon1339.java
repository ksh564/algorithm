package exam.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BaekJoon1339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        HashMap hashMap = new HashMap();
        String[] array = new String[N];
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextLine();
        }
        Arrays.sort(array);
        int index = 9;
        for (int i =0 ; i <array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                Character character = array[i].charAt(j);
                if (!hashMap.containsKey(character)) {
                    hashMap.put(character, index);
                    index--;
                }
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            String value ="";
            for (int j = 0; j < array[i].length(); j++) {
                Character character = array[i].charAt(j);
                String string = String.valueOf(hashMap.get(character));
                value+=string;
            }
            result[i] = Integer.parseInt(value);
        }
        int resultValue = 0;
        for(int i=0; i<result.length; i++){
            resultValue+=result[i];
        }
        System.out.println(resultValue);
    }
}
