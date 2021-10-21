package exam.sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class BaekJoon2751 {
    static int N;
    static boolean[] inputArray;
    static int[] countingArray;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        N = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        inputArray = new boolean[20000001];
        for(int i=0; i<N; i++){
            inputArray[Integer.parseInt(bufferedReader.readLine())+10000000] = true;
        }

        for(int i=0; i< inputArray.length; i++){
            if(inputArray[i]==true){
                stringBuilder.append(i-10000000).append('\n');
            }
        }
        System.out.print(stringBuilder);
    }
}
