package exam.sort;

import java.util.*;

public class BaekJoon2750 {
    static int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<N; i++){
            arr.add(scanner.nextInt());
        }

        Collections.sort(arr);

        for(Integer input : arr){
            System.out.println(input);
        }
    }
}
