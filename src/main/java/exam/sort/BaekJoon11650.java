package exam.sort;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon11650 {
    static int N;
    static int[][] input;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        scanner.nextLine();
        input = new int[N][2];

        for(int i=0; i<N; i++){
            String str = scanner.nextLine();
            String[] inputStr = str.split(" ");
            input[i][0] = Integer.parseInt(inputStr[0]);
            input[i][1] = Integer.parseInt(inputStr[1]);
        }

        Arrays.sort(input, (o1, o2) -> {
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            } else {
               return o1[0] - o2[0];
            }
        });
        for(int[] output : input){
            System.out.println(output[0]+" "+output[1]);
        }

    }
}
