package exam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon5086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()){
           String input = null;
           input = scanner.nextLine();
           ArrayList<String> arrayList = new ArrayList<>();
           StringTokenizer stringTokenizer = new StringTokenizer(input," ");
           while (stringTokenizer.hasMoreTokens()){
               arrayList.add(stringTokenizer.nextToken());
           }
           int a = 0, b= 0;
           a = Integer.parseInt(arrayList.get(0));
           b = Integer.parseInt(arrayList.get(1));
           if(a==0 && b==0) {

           } else if (a % b == 0){
               System.out.println("multiple");
           } else if (b % a == 0){
               System.out.println("factor");
           } else {
               System.out.println("neither");
           }
        }
    }
}