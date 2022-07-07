package exam.bfsdfs;

import java.util.*;

public class BaekJoon2331 {
    static List<Integer> tmp;
    static int index = 0;
    public static void main(String[] args) {
        tmp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        tmp.add(A);
        dfs(A,B);
        System.out.println(index);
    }
    public static void dfs(int input, int P){
        int sum = 0;
        int num = input;
        while (num > 0) {
           int square = (int) Math.pow(num % 10,P);
           num /= 10;
           sum += square;
        }
        if(tmp.contains(sum)){
            index = tmp.indexOf(sum);
            return;
        }
        tmp.add(sum);
        dfs(sum,P);
    }
}
